/**
 * 
 */
package com.easyapp.service;

import java.util.List;

import com.easyapp.dao.entity.Consultant;
import com.easyapp.dao.entity.ConsultantSlot;
import com.easyapp.dao.entity.ConsultantDailySchedule;
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
	Consultant findConsultantByEmail(String email) throws EasyAppoServiceException;
	
	/**
	 * @param consultantCalendars
	 * @return
	 */
	List<ConsultantSlot> saveAllConsultantCalender(List<ConsultantSlot> consultantCalendars) throws EasyAppoServiceException;

	/**
	 * @param consultantId
	 * @return
	 */
	List<ConsultantDailySchedule> findDailySchedulesByConsultantId(Long consultantId) throws EasyAppoServiceException;

	/**
	 * @param consultantDailySchedules
	 * @return
	 */
	List<ConsultantDailySchedule> saveConsultantDailySchedules(List<ConsultantDailySchedule> consultantDailySchedules) throws EasyAppoServiceException;

}
