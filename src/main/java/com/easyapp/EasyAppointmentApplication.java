package com.easyapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.easyapp.dao.entity.UserDetails;
import com.easyapp.service.UserService;
import com.easyapp.service.impl.UserServiceImpl;

@SpringBootApplication
public class EasyAppointmentApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EasyAppointmentApplication.class, args);
	}
	
}
