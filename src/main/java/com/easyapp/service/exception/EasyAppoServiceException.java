package com.easyapp.service.exception;

public class EasyAppoServiceException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 4632412038798953183L;
    private String errorCode;


    public EasyAppoServiceException(String message) {
        super(message);
    }

    public EasyAppoServiceException(String message, String errorCode) {
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
