package com.easyapp.util;

import com.easyapp.exception.BaseException;

public class InvalidPropertyKeyException extends BaseException {
    public InvalidPropertyKeyException(String message) {
        super(message);
    }

    public InvalidPropertyKeyException(String message, String errorCode) {
        super(message, errorCode);
    }
}
