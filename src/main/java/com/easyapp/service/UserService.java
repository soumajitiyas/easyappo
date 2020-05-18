/**
 * 
 */
package com.easyapp.service;

import java.util.List;

import com.easyapp.dao.entity.ConsultantEntity;
import com.easyapp.dao.entity.CustomerEntity;
import com.easyapp.service.exception.EasyAppoServiceException;

/**
 * @author SOUMAJIT
 *
 */

public interface UserService {
	
	public List<ConsultantEntity> getAllConsultants() throws EasyAppoServiceException;
	
	public List<CustomerEntity> getAllCustomers() throws EasyAppoServiceException;
	

}
