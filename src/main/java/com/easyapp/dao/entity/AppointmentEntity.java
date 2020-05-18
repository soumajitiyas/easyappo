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
public class AppointmentEntity extends BaseEntity {
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "consultant_calender_id")
	private ConsultantSlotEntity consultantCalendar;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "appointment_status_id")
	private AppointmentStatusEntity appointmentStatus;

	/**
	 * @return the consultantCalendar
	 */
	public ConsultantSlotEntity getConsultantCalendar() {
		return consultantCalendar;
	}

	/**
	 * @param consultantCalendar the consultantCalendar to set
	 */
	public void setConsultantCalendar(ConsultantSlotEntity consultantCalendar) {
		this.consultantCalendar = consultantCalendar;
	}

	/**
	 * @return the customer
	 */
	public CustomerEntity getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	/**
	 * @return the appointmentStatus
	 */
	public AppointmentStatusEntity getAppointmentStatus() {
		return appointmentStatus;
	}

	/**
	 * @param appointmentStatus the appointmentStatus to set
	 */
	public void setAppointmentStatus(AppointmentStatusEntity appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

}
