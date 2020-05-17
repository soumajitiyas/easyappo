/**
 * 
 */
package com.easyapp.bo;

import java.util.Date;
import java.util.Set;

/**
 * @author DELL
 *
 */
public class ConsultantBO {

	
	private UserDetailsBO userDetails;
	
	private int slotTime;
	
	private Date createdDate;
	
	private Date lastUpdatedDate;

	private Set<ConsultantDailyScheduleBO> consultantDailySchedules;
	
	private Set<ConsultantSlotBO> consultantCalendars;
	
	private Set<ConsultantPayModesBO> consultantPayModes;
	
	private Set<ConsultantFeesBO> consultantFees;

	/**
	 * @return the userDetails
	 */
	public UserDetailsBO getUserDetails() {
		return userDetails;
	}

	/**
	 * @param userDetails the userDetails to set
	 */
	public void setUserDetails(UserDetailsBO userDetails) {
		this.userDetails = userDetails;
	}

	
	/**
	 * @return the slotTime
	 */
	public int getSlotTime() {
		return slotTime;
	}

	/**
	 * @param slotTime the slotTime to set
	 */
	public void setSlotTime(int slotTime) {
		this.slotTime = slotTime;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * @return the consultantDailySchedules
	 */
	public Set<ConsultantDailyScheduleBO> getConsultantDailySchedules() {
		return consultantDailySchedules;
	}

	/**
	 * @param consultantDailySchedules the consultantDailySchedules to set
	 */
	public void setConsultantDailySchedules(Set<ConsultantDailyScheduleBO> consultantDailySchedules) {
		this.consultantDailySchedules = consultantDailySchedules;
	}

	/**
	 * @return the consultantCalendars
	 */
	public Set<ConsultantSlotBO> getConsultantCalendars() {
		return consultantCalendars;
	}

	/**
	 * @param consultantCalendars the consultantCalendars to set
	 */
	public void setConsultantCalendars(Set<ConsultantSlotBO> consultantCalendars) {
		this.consultantCalendars = consultantCalendars;
	}

	/**
	 * @return the consultantPayModes
	 */
	public Set<ConsultantPayModesBO> getConsultantPayModes() {
		return consultantPayModes;
	}

	/**
	 * @param consultantPayModes the consultantPayModes to set
	 */
	public void setConsultantPayModes(Set<ConsultantPayModesBO> consultantPayModes) {
		this.consultantPayModes = consultantPayModes;
	}

	/**
	 * @return the consultantFees
	 */
	public Set<ConsultantFeesBO> getConsultantFees() {
		return consultantFees;
	}

	/**
	 * @param consultantFees the consultantFees to set
	 */
	public void setConsultantFees(Set<ConsultantFeesBO> consultantFees) {
		this.consultantFees = consultantFees;
	}

	@Override
	public String toString() {
		return "ConsultantBO [userDetails=" + userDetails + ", slotTime=" + slotTime + ", createdDate=" + createdDate
				+ ", lastUpdatedDate=" + lastUpdatedDate + ", consultantDailySchedules=" + consultantDailySchedules
				+ ", consultantCalendars=" + consultantCalendars + ", consultantPayModes=" + consultantPayModes
				+ ", consultantFees=" + consultantFees + "]";
	}
	
	
	
}
