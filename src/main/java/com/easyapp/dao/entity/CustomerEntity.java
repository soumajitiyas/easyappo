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
public class CustomerEntity extends BaseEntity {

	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "user_details_id")
	private UserDetails userDetails;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Set<AppointmentEntity> appointments;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Set<CustomerPaymentEntity> customerPayments;

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
	public Set<AppointmentEntity> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments the appointments to set
	 */
	public void setAppointments(Set<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}

	/**
	 * @return the customerPayments
	 */
	public Set<CustomerPaymentEntity> getCustomerPayments() {
		return customerPayments;
	}

	/**
	 * @param customerPayments the customerPayments to set
	 */
	public void setCustomerPayments(Set<CustomerPaymentEntity> customerPayments) {
		this.customerPayments = customerPayments;
	}

	@Override
	public String toString() {
		return "CustomerEntity{" +
				"userDetails=" + userDetails +
				", appointments=" + appointments +
				", customerPayments=" + customerPayments +
				'}';
	}


}
