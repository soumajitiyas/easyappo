/**
 * 
 */
package com.easyapp.service.impl;

import java.util.List;

import com.easyapp.service.exception.EasyAppoServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyapp.dao.repository.ConsultantRepository;
import com.easyapp.dao.repository.ClientRepository;
import com.easyapp.dao.entity.ConsultantEntity;
import com.easyapp.dao.entity.ClientEntity;
import com.easyapp.service.UserService;

/**
 * @author DELL
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	ConsultantRepository consultantsRepository;
	

	@Autowired
	ClientRepository customersRepository;
	
	@Override
	public List<ConsultantEntity> getAllConsultants() throws EasyAppoServiceException {
		return consultantsRepository.findAll();
	}

	@Override
	public List<ClientEntity> getAllCustomers() throws EasyAppoServiceException {
		return customersRepository.findAll();
	}

}
