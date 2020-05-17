package com.easyapp.web.controller.response;

import java.io.Serializable;

public class ResponseError implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4967182126505709627L;

    private String errorCode;
    private String errorDescription;
    public String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    public String getErrorDescription() {
        return errorDescription;
    }
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
    @Override
    public String toString() {
        return "BaseResponseError [errorCode=" + errorCode + ", errorDescription=" + errorDescription + "]";
    }

}