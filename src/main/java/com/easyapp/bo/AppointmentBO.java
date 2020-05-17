/**
 * 
 */
package com.easyapp.bo;

import java.util.Date;

/**
 * @author DELL
 *
 */

public class AppointmentBO {
	
	private long id;
	
	private ConsultantSlotBO consultantCalendar;
	
	private CustomerBO customer;
	
	private AppointmentStatusBO appointmentStatus;
	
	private Date createdDate;
	
	private Date lastUpdatedDate;

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
	 * @return the consultantCalendar
	 */
	public ConsultantSlotBO getConsultantCalendar() {
		return consultantCalendar;
	}

	/**
	 * @param consultantCalendar the consultantCalendar to set
	 */
	public void setConsultantCalendar(ConsultantSlotBO consultantCalendar) {
		this.consultantCalendar = consultantCalendar;
	}

	/**
	 * @return the customer
	 */
	public CustomerBO getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(CustomerBO customer) {
		this.customer = customer;
	}

	/**
	 * @return the appointmentStatus
	 */
	public AppointmentStatusBO getAppointmentStatus() {
		return appointmentStatus;
	}

	/**
	 * @param appointmentStatus the appointmentStatus to set
	 */
	public void setAppointmentStatus(AppointmentStatusBO appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
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
	
	

}
