package com.easyapp.domain;

import com.easyapp.dto.NotificationResult;
import com.easyapp.service.exception.EasyAppoBusinessException;

public interface Notification {
    NotificationResult send(User user) throws EasyAppoBusinessException;
}
