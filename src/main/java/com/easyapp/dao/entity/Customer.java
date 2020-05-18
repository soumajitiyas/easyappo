/**
 * 
 */
package com.easyapp.dao.entity;

import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name = "tbl_customers")
public class Customer extends BaseEntity {

	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "user_details_id")
	private UserDetails userDetails;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Set<Appointment> appointments;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Set<CustomerPayment> customerPayments;

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
	 * @return the appointments
	 */
	public Set<Appointment> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments the appointments to set
	 */
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

	/**
	 * @return the customerPayments
	 */
	public Set<CustomerPayment> getCustomerPayments() {
		return customerPayments;
	}

	/**
	 * @param customerPayments the customerPayments to set
	 */
	public void setCustomerPayments(Set<CustomerPayment> customerPayments) {
		this.customerPayments = customerPayments;
	}

	@Override
	public String toString() {
		return "Customer [userDetails=" + userDetails + ", appointments=" + appointments + ", customerPayments="
				+ customerPayments + ", getId()=" + getId() + ", getCreatedBy()=" + getCreatedBy() + ", getCreatedAt()="
				+ getCreatedAt() + ", getUpdatedBy()=" + getUpdatedBy() + ", getUpdatedAt()=" + getUpdatedAt() + "]";
	}
	
	
	
}
