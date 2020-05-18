/**
 * 
 */
package com.easyapp.dao.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name = "tbl_consultant_slots")
public class ConsultantSlotEntity extends BaseEntity {

	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "consultant_id")
	private ConsultantEntity consultant;
	
	@Column(name = "slot_date")
	private Date slotDate;
	
	@Column(name = "slot_start_time")
	private Date slotStartTime;

	@Column(name = "slot_end_time")
	private Date slotEndTime;
	
	@Column(name = "slot_status")
	private String slotStatus;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_slot_id")
	private AppointmentEntity appointment;


	/**
	 * @return the consultant
	 */
	public ConsultantEntity getConsultant() {
		return consultant;
	}

	/**
	 * @param consultant the consultant to set
	 */
	public void setConsultant(ConsultantEntity consultant) {
		this.consultant = consultant;
	}

	

	/**
	 * @return the slotDate
	 */
	public Date getSlotDate() {
		return slotDate;
	}

	/**
	 * @param slotDate the slotDate to set
	 */
	public void setSlotDate(Date slotDate) {
		this.slotDate = slotDate;
	}

	/**
	 * @return the slotStartTime
	 */
	public Date getSlotStartTime() {
		return slotStartTime;
	}

	/**
	 * @param slotStartTime the slotStartTime to set
	 */
	public void setSlotStartTime(Date slotStartTime) {
		this.slotStartTime = slotStartTime;
	}

	/**
	 * @return the slotEndTime
	 */
	public Date getSlotEndTime() {
		return slotEndTime;
	}

	/**
	 * @param slotEndTime the slotEndTime to set
	 */
	public void setSlotEndTime(Date slotEndTime) {
		this.slotEndTime = slotEndTime;
	}


	/**
	 * @return the slotStatus
	 */
	public String getSlotStatus() {
		return slotStatus;
	}

	/**
	 * @param slotStatus the slotStatus to set
	 */
	public void setSlotStatus(String slotStatus) {
		this.slotStatus = slotStatus;
	}

	/**
	 * @return the appointment
	 */
	public AppointmentEntity getAppointment() {
		return appointment;
	}

	/**
	 * @param appointment the appointment to set
	 */
	public void setAppointment(AppointmentEntity appointment) {
		this.appointment = appointment;
	}

	
}
