/**
 * 
 */
package com.easyapp.service;

import java.util.List;

import com.easyapp.dao.entity.Consultant;
import com.easyapp.dao.entity.Customer;
import com.easyapp.service.exception.EasyAppoServiceException;

/**
 * @author SOUMAJIT
 *
 */

public interface UserService {
	
	public List<Consultant> getAllConsultants() throws EasyAppoServiceException;
	
	public List<Customer> getAllCustomers() throws EasyAppoServiceException;
	

}
