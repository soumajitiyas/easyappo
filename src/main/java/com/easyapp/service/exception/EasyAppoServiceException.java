package com.easyapp.service.exception;

import com.easyapp.exception.BaseException;

public class EasyAppoServiceException extends BaseException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6869915091060018022L;

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
