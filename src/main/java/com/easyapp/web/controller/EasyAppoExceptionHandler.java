package com.easyapp.web.controller;

import com.easyapp.service.exception.EasyAppoServiceException;
import com.easyapp.util.Property;
import com.easyapp.web.controller.response.Response;
import com.easyapp.web.controller.response.ResponseError;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ControllerAdvice
public class EasyAppoExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Response<Void>> handleAllExceptions(Exception ex, WebRequest request) {
        Response<Void> response = new Response<Void>();
        ResponseError error = new ResponseError();
        error.setErrorCode("INTERNAL_ERROR");
        error.setErrorDescription("Something went wrong");
        response.setError(error);
        return ResponseEntity.status(200).body(response);
    }

    @ExceptionHandler(EasyAppoServiceException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(EasyAppoServiceException ex,
                                                                    WebRequest request) {
        Response<Void> response = new Response<Void>();
        ResponseError error = new ResponseError();
        error.setErrorCode(getErrorCode(ex));
        error.setErrorDescription(getErrorMessage(error.getErrorCode()));
        if (StringUtils.isEmpty(error.getErrorDescription())) {
            error.setErrorDescription("Something went wrong");
        }
        response.setError(error);
        return ResponseEntity.status(200).body(response);
    }

    private String getErrorCode(Throwable ex) {
        try {
            Method m = ex.getClass().getMethod("getErrorCode");
            String message = (String) m.invoke(ex);
            if (StringUtils.isEmpty(message) && ex.getCause() != null) {
                return getErrorCode(ex.getCause());
            }
            return "INTERNAL_ERROR";
        } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {
            return "INTERNAL_ERROR";
        }
    }

    private String getErrorMessage(String errorCode) {
        return Property.getString(errorCode);
    }
}
