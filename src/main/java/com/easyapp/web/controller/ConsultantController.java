/**
 * 
 */
package com.easyapp.web.controller;

import java.util.List;

import com.easyapp.service.exception.EasyAppoServiceException;
import com.easyapp.web.controller.response.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyapp.bo.ConsultantBO;
import com.easyapp.bo.UserDetailsBO;
import com.easyapp.dao.entity.ConsultantEntity;
import com.easyapp.dao.entity.ConsultantDailyScheduleEntity;
import com.easyapp.service.ConsultantService;

/**
 * @author DELL
 *
 */
@RestController
@RequestMapping("/consultants")
public class ConsultantController {
	
	@Autowired
	ConsultantService consultantService;
	
	@GetMapping("/{email}")
	public ResponseEntity<Response<ConsultantBO>> findConsultantByEmail(@PathVariable String email) throws EasyAppoServiceException {
		
		ConsultantEntity consultant = consultantService.findConsultantByEmail(email);
		ConsultantBO consultantBO = new ConsultantBO();
		UserDetailsBO userDetailsBO = new UserDetailsBO();
		BeanUtils.copyProperties(consultant, consultantBO, "userDetails","consultantDailySchedules","consultantCalendars","consultantPayModes","consultantFees");
		BeanUtils.copyProperties(consultant.getUserDetails(), userDetailsBO);
		consultantBO.setUserDetails(userDetailsBO);
		return ResponseEntity.ok(new Response<ConsultantBO>(consultantBO));
	}
	
	@PostMapping("/dailySchedule")
	public ResponseEntity<Response<List<ConsultantDailyScheduleEntity>>> saveConsultantDailySchedule(@RequestBody List<ConsultantDailyScheduleEntity> consultantDailySchedules) throws EasyAppoServiceException {
		List<ConsultantDailyScheduleEntity> consultantDailySchedules2 = consultantService.saveConsultantDailySchedules(consultantDailySchedules);
		return null;
	}

}
