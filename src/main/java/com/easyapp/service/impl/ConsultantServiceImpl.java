/**
 * 
 */
package com.easyapp.service.impl;

import java.util.List;

import com.easyapp.service.exception.EasyAppoServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyapp.dao.repository.ConsultantCalendarRepository;
import com.easyapp.dao.repository.ConsultantDailyScheduleRepository;
import com.easyapp.dao.repository.ConsultantsRepository;
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
	public List<ConsultantDailySchedule> saveConsultantDailySchedules(List<ConsultantDailySchedule> consultantDailySchedules) throws EasyAppoServiceException {
		return consultantDailyScheduleRepository.saveAll(consultantDailySchedules);
	}
	
	@Override
	public List<ConsultantDailySchedule> findDailySchedulesByConsultantId(Long consultantId) throws EasyAppoServiceException{
		return consultantDailyScheduleRepository.findDailySchedulesByConsultantId(consultantId);
	}
	
	@Override
	public List<ConsultantSlot> saveAllConsultantCalender(List<ConsultantSlot> consultantCalendars) throws EasyAppoServiceException{
		return consultantCalendarRepository.saveAll(consultantCalendars);
	}

}
