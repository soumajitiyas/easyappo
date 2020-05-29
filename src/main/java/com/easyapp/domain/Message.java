package com.easyapp.domain;

import com.easyapp.dto.NotificationResult;
import com.easyapp.service.exception.EasyAppoBusinessException;
import com.easyapp.service.exception.EasyAppoServiceException;

public interface Message {
    NotificationResult send(User user) throws EasyAppoBusinessException;
}
