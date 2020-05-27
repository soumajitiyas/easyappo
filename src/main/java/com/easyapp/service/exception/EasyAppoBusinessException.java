package com.easyapp.service.exception;

import com.easyapp.exception.BaseException;

public class EasyAppoBusinessException extends BaseException {

    public EasyAppoBusinessException(String message) {
        super(message);
    }

    public EasyAppoBusinessException(String message, String errorCode) {
        super(message, errorCode);
    }

    public EasyAppoBusinessException(String message, String errorCode, Throwable ex) {
        super(message, errorCode);
        initCause(ex);
    }

    public EasyAppoBusinessException(String message, Throwable ex) {
        super(message);
        initCause(ex);
    }
}
