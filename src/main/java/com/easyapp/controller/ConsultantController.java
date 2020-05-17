/**
 * 
 */
package com.easyapp.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyapp.bo.ConsultantBO;
import com.easyapp.bo.UserDetailsBO;
import com.easyapp.dao.entity.Consultant;
import com.easyapp.dao.entity.ConsultantDailySchedule;
import com.easyapp.service.ConsultantService;

/**
 * @author DELL
 *
 */
@RestController
@RequestMapping("/easyappy")
public class ConsultantController {
	
	@Autowired
	ConsultantService consultantService;
	
	@GetMapping("/consultants/{email}")
	public ConsultantBO findConsultantByEmail(@PathVariable String email) {
		
		Consultant consultant = consultantService.findConsultantByEmail(email);
		ConsultantBO consultantBO = new ConsultantBO();
		UserDetailsBO userDetailsBO = new UserDetailsBO();
		BeanUtils.copyProperties(consultant, consultantBO, "userDetails","consultantDailySchedules","consultantCalendars","consultantPayModes","consultantFees");
		BeanUtils.copyProperties(consultant.getUserDetails(), userDetailsBO);
		consultantBO.setUserDetails(userDetailsBO);
		return consultantBO;
	}
	
	@PostMapping("/consultants/dailySchedule")
	public List<ConsultantDailySchedule> saveConsultantDailySchedule(@RequestBody List<ConsultantDailySchedule> consultantDailySchedules) {
		List<ConsultantDailySchedule> consultantDailySchedules2 = consultantService.saveConsultantDailySchedules(consultantDailySchedules);
		return consultantDailySchedules2;
	}

}
