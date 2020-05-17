/**
 * 
 */
package com.easyapp.dao.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Consultant extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@OneToOne
	@JoinColumn(name = "user_details_id")
	private UserDetails userDetails;
	
	@Column(name = "slot_time")
	private int slotTime;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_id")
	private Set<ConsultantDailySchedule> consultantDailySchedules;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_id")
	private Set<ConsultantSlot> consultantCalendars;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_id")
	private Set<ConsultantPayModes> consultantPayModes;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_id")
	private Set<ConsultantFees> consultantFees;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

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
	public Set<ConsultantDailySchedule> getConsultantDailySchedules() {
		return consultantDailySchedules;
	}

	/**
	 * @param consultantDailySchedules the consultantDailySchedules to set
	 */
	public void setConsultantDailySchedules(Set<ConsultantDailySchedule> consultantDailySchedules) {
		this.consultantDailySchedules = consultantDailySchedules;
	}

	/**
	 * @return the consultantCalendars
	 */
	public Set<ConsultantSlot> getConsultantCalendars() {
		return consultantCalendars;
	}

	/**
	 * @param consultantCalendars the consultantCalendars to set
	 */
	public void setConsultantCalendars(Set<ConsultantSlot> consultantCalendars) {
		this.consultantCalendars = consultantCalendars;
	}

	/**
	 * @return the consultantPayModes
	 */
	public Set<ConsultantPayModes> getConsultantPayModes() {
		return consultantPayModes;
	}

	/**
	 * @param consultantPayModes the consultantPayModes to set
	 */
	public void setConsultantPayModes(Set<ConsultantPayModes> consultantPayModes) {
		this.consultantPayModes = consultantPayModes;
	}

	/**
	 * @return the consultantFees
	 */
	public Set<ConsultantFees> getConsultantFees() {
		return consultantFees;
	}

	/**
	 * @param consultantFees the consultantFees to set
	 */
	public void setConsultantFees(Set<ConsultantFees> consultantFees) {
		this.consultantFees = consultantFees;
	}
	
	
	
}
