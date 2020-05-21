package com.easyapp.service.exception;

import com.easyapp.exception.BaseException;

public class EasyAppoServiceException extends BaseException {

    public EasyAppoServiceException(String message) {
        super(message);
    }

    public EasyAppoServiceException(String message, String errorCode) {
        super(message, errorCode);
    }

    public EasyAppoServiceException(String message, String errorCode, Throwable ex) {
        super(message, errorCode);
        initCause(ex);
    }

    public EasyAppoServiceException(String message, Throwable ex) {
        super(message);
        initCause(ex);
    }
}
