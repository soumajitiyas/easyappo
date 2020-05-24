/**
 * 
 */
package com.easyapp.service;

import java.util.List;

import com.easyapp.dao.entity.ConsultantDailyScheduleEntity;
import com.easyapp.dao.entity.ConsultantUnavailableSlotEntity;
import com.easyapp.service.exception.EasyAppoServiceException;

/**
 * @author DELL
 *
 */
public interface ConsultantService {

	/**
	 * @param consultantCalendars
	 * @return
	 */
	List<ConsultantUnavailableSlotEntity> saveAllConsultantCalender(List<ConsultantUnavailableSlotEntity> consultantCalendars) throws EasyAppoServiceException;

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
