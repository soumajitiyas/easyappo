/**
 * 
 */
package com.easyapp.service;

import java.util.List;

import com.easyapp.dao.entity.ConsultantEntity;
import com.easyapp.dao.entity.ConsultantSlotEntity;
import com.easyapp.dao.entity.ConsultantDailyScheduleEntity;
import com.easyapp.service.exception.EasyAppoServiceException;

/**
 * @author DELL
 *
 */
public interface ConsultantService {

	/**
	 * @param email
	 * @return
	 */
	ConsultantEntity findConsultantByEmail(String email) throws EasyAppoServiceException;
	
	/**
	 * @param consultantCalendars
	 * @return
	 */
	List<ConsultantSlotEntity> saveAllConsultantCalender(List<ConsultantSlotEntity> consultantCalendars) throws EasyAppoServiceException;

	/**
	 * @param consultantId
	 * @return
	 */
	List<ConsultantDailyScheduleEntity> findDailySchedulesByConsultantId(Long consultantId) throws EasyAppoServiceException;

	/**
	 * @param consultantDailySchedules
	 * @return
	 */
	List<ConsultantDailyScheduleEntity> saveConsultantDailySchedules(List<ConsultantDailyScheduleEntity> consultantDailySchedules) throws EasyAppoServiceException;

}
