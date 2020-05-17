/**
 * 
 */
package com.easyapp.web.controller;

import com.easyapp.service.exception.EasyAppoServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyapp.service.UserService;

/**
 * @author DELL
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/consultants")
	public String getAllConsultants() throws EasyAppoServiceException {
		System.out.println(userService.getAllConsultants().get(0).getUserDetails().getFirstName());
		System.out.println("done");
		return userService.getAllConsultants().get(0).getUserDetails().getFirstName();
	}
	
	@GetMapping("/customers")
	public String getAllCustomers() throws EasyAppoServiceException {
		System.out.println(userService.getAllCustomers().get(0).getUserDetails().getFirstName());
		System.out.println("done");
		return userService.getAllCustomers().get(0).getUserDetails().getFirstName();
	}
	
}
