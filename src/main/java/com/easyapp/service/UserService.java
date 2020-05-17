/**
 * 
 */
package com.easyapp.service;

import java.util.List;

import com.easyapp.dao.entity.Consultant;
import com.easyapp.dao.entity.Customer;

/**
 * @author SOUMAJIT
 *
 */

public interface UserService {
	
	public List<Consultant> getAllConsultants();
	
	public List<Customer> getAllCustomers();
	

}
