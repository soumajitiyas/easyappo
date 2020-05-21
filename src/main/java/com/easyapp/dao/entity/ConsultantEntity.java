/**
 * 
 */
package com.easyapp.dao.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name = "tbl_consultants")
public class ConsultantEntity extends BaseEntity{

	@OneToOne
	@JoinColumn(name = "user_details_id")
	private UserDetails userDetails;
	
	@Column(name = "slot_time")
	private int slotTime;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_id")
	private Set<ConsultantDailyScheduleEntity> consultantDailySchedules;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_id")
	private Set<ConsultantSlotEntity> consultantCalendars;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_id")
	private Set<ConsultantPayModesEntity> consultantPayModes;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_id")
	private Set<ConsultantFeesEntity> consultantFees;

	/**
	 * @return the userDetails
	 */
	public UserDetails getUserDetails() {
		return userDetails;
	}

	/**
	 * @param userDetails the userDetails to set
	 */
	public void setUserDetails(UserDetails userDetails) {
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
	 * @return the consultantDailySchedules
	 */
	public Set<ConsultantDailyScheduleEntity> getConsultantDailySchedules() {
		return consultantDailySchedules;
	}

	/**
	 * @param consultantDailySchedules the consultantDailySchedules to set
	 */
	public void setConsultantDailySchedules(Set<ConsultantDailyScheduleEntity> consultantDailySchedules) {
		this.consultantDailySchedules = consultantDailySchedules;
	}

	/**
	 * @return the consultantCalendars
	 */
	public Set<ConsultantSlotEntity> getConsultantCalendars() {
		return consultantCalendars;
	}

	/**
	 * @param consultantCalendars the consultantCalendars to set
	 */
	public void setConsultantCalendars(Set<ConsultantSlotEntity> consultantCalendars) {
		this.consultantCalendars = consultantCalendars;
	}

	/**
	 * @return the consultantPayModes
	 */
	public Set<ConsultantPayModesEntity> getConsultantPayModes() {
		return consultantPayModes;
	}

	/**
	 * @param consultantPayModes the consultantPayModes to set
	 */
	public void setConsultantPayModes(Set<ConsultantPayModesEntity> consultantPayModes) {
		this.consultantPayModes = consultantPayModes;
	}

	/**
	 * @return the consultantFees
	 */
	public Set<ConsultantFeesEntity> getConsultantFees() {
		return consultantFees;
	}

	/**
	 * @param consultantFees the consultantFees to set
	 */
	public void setConsultantFees(Set<ConsultantFeesEntity> consultantFees) {
		this.consultantFees = consultantFees;
	}
	
	
	
}
