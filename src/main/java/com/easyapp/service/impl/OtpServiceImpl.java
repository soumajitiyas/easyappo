package com.easyapp.service.impl;

import com.easyapp.dao.entity.ClientEntity;
import com.easyapp.dao.entity.OtpEntity;
import com.easyapp.dao.repository.ClientRepository;
import com.easyapp.dao.repository.OtpRepository;
import com.easyapp.service.OtpService;
import com.easyapp.service.exception.EasyAppoServiceException;
import com.easyapp.util.InvalidPropertyKeyException;
import com.easyapp.util.Property;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Random;

public class OtpServiceImpl implements OtpService {

    @Autowired
    OtpRepository otpRepository;

    @Autowired
    ClientRepository customersRepository;

    @Override
    public String sendOtp(String context, long customerId, String[] channels) throws EasyAppoServiceException {
        Optional<ClientEntity> customerEntity = customersRepository.findById(customerId);
        if (customerEntity.isPresent()) {
            OtpEntity otpEntity = new OtpEntity();
            otpEntity.setContext(context);
            //TODO Generate reference id
            String referenceId = "";
            otpEntity.setReferenceId(referenceId);
            otpEntity.setOtp(generateOtp());
            otpEntity.setRetryCount(0);
            otpRepository.save(otpEntity);
            //TODO Call notification Service to send
            return referenceId;
        }
        throw new EasyAppoServiceException(String.format("Invalid customer id: %s", customerEntity));
    }

    @Override
    public boolean verifyOtp(String context, String referenceId, long customerId, String otp) throws EasyAppoServiceException {
        return false;
    }

    private String generateOtp() throws EasyAppoServiceException {
        try {
            int otpLength = Property.getInt("");
            Random otp = new Random();

            StringBuilder builder = new StringBuilder();
            for (int count = 0; count <= otpLength; count++) {
                builder.append(otp.nextInt(10));
            }
            return builder.toString();
        } catch (InvalidPropertyKeyException e) {
            e.printStackTrace();
            EasyAppoServiceException ex = new EasyAppoServiceException("Exception occued while generating OTP", e);
            throw ex;
        }
    }
}
