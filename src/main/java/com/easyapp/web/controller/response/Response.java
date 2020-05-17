package com.easyapp.web.controller.response;

import java.io.Serializable;

public class Response<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2728064133835048283L;

    private ResponseError error;
    private T data;

    public Response() {
        super();
    }

    public Response(T data) {
        super();
        this.data = data;
    }

    public ResponseError getError() {
        return error;
    }

    public void setError(ResponseError error) {
        this.error = error;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResponse [error=" + error + ", data=" + data + "]";
    }

}
