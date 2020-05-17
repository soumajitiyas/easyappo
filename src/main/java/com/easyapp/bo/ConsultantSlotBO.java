/**
 * 
 */
package com.easyapp.bo;

import java.util.Date;

/**
 * @author DELL
 *
 */
public class ConsultantSlotBO {
	
	private long id;
	
	private ConsultantBO consultant;
	
	private Date slotDate;
	
	private Date slotStartTime;

	private Date slotEndTime;
	
	private String slotStatus;
	
	private Date createdDate;
	
	private Date lastUpdatedDate;

	private AppointmentBO appointment;
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
	 * @return the consultant
	 */
	public ConsultantBO getConsultant() {
		return consultant;
	}

	/**
	 * @param consultant the consultant to set
	 */
	public void setConsultant(ConsultantBO consultant) {
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
	 * @return the appointment
	 */
	public AppointmentBO getAppointment() {
		return appointment;
	}

	/**
	 * @param appointment the appointment to set
	 */
	public void setAppointment(AppointmentBO appointment) {
		this.appointment = appointment;
	}

	
}
