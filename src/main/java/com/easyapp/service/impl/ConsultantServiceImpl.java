/**
 * 
 */
package com.easyapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyapp.dao.entity.ConsultantDailyScheduleEntity;
import com.easyapp.dao.entity.ConsultantUnavailableSlotEntity;
import com.easyapp.dao.repository.ConsultantDailyScheduleRepository;
import com.easyapp.dao.repository.ConsultantRepository;
import com.easyapp.dao.repository.ConsultantUnavailableSlotRepository;
import com.easyapp.service.ConsultantService;
import com.easyapp.service.exception.EasyAppoServiceException;

/**
 * @author DELL
 *
 */
@Service
public class ConsultantServiceImpl implements ConsultantService {

	@Autowired
	ConsultantRepository consultantsRepository;
	
	@Autowired
	ConsultantDailyScheduleRepository consultantDailyScheduleRepository;
	
	@Autowired
	ConsultantUnavailableSlotRepository consultantCalendarRepository;
	
	@Override
	public List<ConsultantDailyScheduleEntity> saveConsultantDailySchedules(List<ConsultantDailyScheduleEntity> consultantDailySchedules) throws EasyAppoServiceException {
		return consultantDailyScheduleRepository.saveAll(consultantDailySchedules);
	}
	
	@Override
	public List<ConsultantDailyScheduleEntity> findDailySchedulesByConsultantId(Long consultantId) throws EasyAppoServiceException{
		return consultantDailyScheduleRepository.findDailySchedulesByConsultantId(consultantId);
	}
	
	@Override
	public List<ConsultantUnavailableSlotEntity> saveAllConsultantCalender(List<ConsultantUnavailableSlotEntity> consultantCalendars) throws EasyAppoServiceException{
		return consultantCalendarRepository.saveAll(consultantCalendars);
	}

}
