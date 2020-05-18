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
import com.easyapp.dao.entity.ConsultantEntity;
import com.easyapp.dao.entity.ConsultantSlotEntity;
import com.easyapp.dao.entity.ConsultantDailyScheduleEntity;
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
	public ConsultantEntity findConsultantByEmail(String email) {
		return consultantsRepository.findConsultantByEmail(email);
	}
	
	@Override
	public List<ConsultantDailyScheduleEntity> saveConsultantDailySchedules(List<ConsultantDailyScheduleEntity> consultantDailySchedules) throws EasyAppoServiceException {
		return consultantDailyScheduleRepository.saveAll(consultantDailySchedules);
	}
	
	@Override
	public List<ConsultantDailyScheduleEntity> findDailySchedulesByConsultantId(Long consultantId) throws EasyAppoServiceException{
		return consultantDailyScheduleRepository.findDailySchedulesByConsultantId(consultantId);
	}
	
	@Override
	public List<ConsultantSlotEntity> saveAllConsultantCalender(List<ConsultantSlotEntity> consultantCalendars) throws EasyAppoServiceException{
		return consultantCalendarRepository.saveAll(consultantCalendars);
	}

}
