package com.easyapp.exception;

public class BaseException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 4632412038798953183L;
    private String errorCode;


    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }



    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "NotificationServiceException [errorCode=" + errorCode + "]";
    }
}
