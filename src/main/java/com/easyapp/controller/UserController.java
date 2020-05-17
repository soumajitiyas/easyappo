/**
 * 
 */
package com.easyapp.controller;

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
@RequestMapping("/easyappy")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/consultants")
	public String getAllConsultants() {
		System.out.println(userService.getAllConsultants().get(0).getUserDetails().getFirstName());
		System.out.println("done");
		return userService.getAllConsultants().get(0).getUserDetails().getFirstName();
	}
	
	@GetMapping("/customers")
	public String getAllCustomers() {
		System.out.println(userService.getAllCustomers().get(0).getUserDetails().getFirstName());
		System.out.println("done");
		return userService.getAllCustomers().get(0).getUserDetails().getFirstName();
	}
	
}
