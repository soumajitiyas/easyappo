package com.easyapp.service;

import com.easyapp.service.exception.EasyAppoServiceException;

public interface OtpService {
    String sendOtp(String context, long clientId, String[] channels) throws EasyAppoServiceException;
    boolean verifyOtp(String context, String referenceId, long customerId, String otp) throws EasyAppoServiceException;
}
