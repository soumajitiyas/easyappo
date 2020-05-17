/**
 * 
 */
package com.easyapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyapp.dao.ConsultantsRepository;
import com.easyapp.dao.CustomersRepository;
import com.easyapp.dao.entity.Consultant;
import com.easyapp.dao.entity.Customer;
import com.easyapp.service.UserService;

/**
 * @author DELL
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	ConsultantsRepository consultantsRepository;
	

	@Autowired
	CustomersRepository customersRepository;
	
	@Override
	public List<Consultant> getAllConsultants() {
		return consultantsRepository.findAll();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customersRepository.findAll();
	}

}
