/**
 * 
 */
package com.easyapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyapp.dao.ConsultantCalendarRepository;
import com.easyapp.dao.ConsultantDailyScheduleRepository;
import com.easyapp.dao.ConsultantsRepository;
import com.easyapp.dao.entity.Consultant;
import com.easyapp.dao.entity.ConsultantSlot;
import com.easyapp.dao.entity.ConsultantDailySchedule;
import com.easyapp.service.ConsultantService;

/**
 * @author DELL
 *
 */
@Service
public class ConsultantServiceImpl implements ConsultantService {

	@Autowired
	ConsultantsRepository consultantsRepository;
	
	@Autowired
	ConsultantDailyScheduleRepository consultantDailyScheduleRepository;
	
	@Autowired
	ConsultantCalendarRepository consultantCalendarRepository;
	
	@Override
	public Consultant findConsultantByEmail(String email) {
		return consultantsRepository.findConsultantByEmail(email);
	}
	
	@Override
	public List<ConsultantDailySchedule> saveConsultantDailySchedules(List<ConsultantDailySchedule> consultantDailySchedules) {
		return consultantDailyScheduleRepository.saveAll(consultantDailySchedules);
	}
	
	@Override
	public List<ConsultantDailySchedule> findDailySchedulesByConsultantId(Long consultantId) {
		return consultantDailyScheduleRepository.findDailySchedulesByConsultantId(consultantId);
	}
	
	@Override
	public List<ConsultantSlot> saveAllConsultantCalender(List<ConsultantSlot> consultantCalendars) {
		return consultantCalendarRepository.saveAll(consultantCalendars);
	}

}
