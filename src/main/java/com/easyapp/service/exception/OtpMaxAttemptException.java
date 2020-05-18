package com.easyapp.service.exception;

import com.easyapp.exception.BaseException;

public class OtpMaxAttemptException extends BaseException {
    public OtpMaxAttemptException(String message) {
        super(message);
    }

    public OtpMaxAttemptException(String message, String errorCode) {
        super(message, errorCode);
    }
}
