/**
 * 
 */
package com.easyapp.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author DELL
 *
 */

@Entity
@Table(name = "tbl_appointment")
public class Appointment extends BaseEntity {
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "consultant_calender_id")
	private ConsultantSlot consultantCalendar;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "appointment_status_id")
	private AppointmentStatus appointmentStatus;
	
	/**
	 * @return the consultantCalendar
	 */
	public ConsultantSlot getConsultantCalendar() {
		return consultantCalendar;
	}

	/**
	 * @param consultantCalendar the consultantCalendar to set
	 */
	public void setConsultantCalendar(ConsultantSlot consultantCalendar) {
		this.consultantCalendar = consultantCalendar;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the appointmentStatus
	 */
	public AppointmentStatus getAppointmentStatus() {
		return appointmentStatus;
	}

	/**
	 * @param appointmentStatus the appointmentStatus to set
	 */
	public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

}
