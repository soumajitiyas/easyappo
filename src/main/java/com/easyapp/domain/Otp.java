package com.easyapp.domain;

import com.easyapp.dto.NotificationResult;
import com.easyapp.service.exception.EasyAppoBusinessException;
import com.easyapp.service.exception.EasyAppoServiceException;

@Domain
public class Otp implements Message {

    public NotificationResult send(User user) throws EasyAppoBusinessException {
        return null;
    }
}
