/**
 * 
 */
package com.easyapp.service;

import java.util.List;

import com.easyapp.dao.entity.Consultant;
import com.easyapp.dao.entity.ConsultantSlot;
import com.easyapp.dao.entity.ConsultantDailySchedule;

/**
 * @author DELL
 *
 */
public interface ConsultantService {

	/**
	 * @param email
	 * @return
	 */
	Consultant findConsultantByEmail(String email);
	
	/**
	 * @param consultantCalendars
	 * @return
	 */
	List<ConsultantSlot> saveAllConsultantCalender(List<ConsultantSlot> consultantCalendars);

	/**
	 * @param consultantId
	 * @return
	 */
	List<ConsultantDailySchedule> findDailySchedulesByConsultantId(Long consultantId);

	/**
	 * @param consultantDailySchedules
	 * @return
	 */
	List<ConsultantDailySchedule> saveConsultantDailySchedules(List<ConsultantDailySchedule> consultantDailySchedules);

}
