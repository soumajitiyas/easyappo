package com.easyapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.easyapp.dao.entity.ConfigEntity;
import com.easyapp.dao.repository.ConfigRepository;
import com.easyapp.domain.User;
import com.easyapp.util.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.easyapp.dao.entity.UserEntity;
import com.easyapp.service.UserService;
import com.easyapp.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EasyAppointmentApplication {

	@Autowired
	ConfigRepository configRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(EasyAppointmentApplication.class, args);
	}

	@EventListener({ ContextRefreshedEvent.class })
	public void registerRepositories() {
		Map<String, String> configMap = new HashMap<String, String>();
		List<ConfigEntity> configs = configRepo.findAll();
		for (ConfigEntity c : configs) {
			configMap.put(c.getKey(), c.getValue());
		}
		Property.addAll(configMap);
	}
}
