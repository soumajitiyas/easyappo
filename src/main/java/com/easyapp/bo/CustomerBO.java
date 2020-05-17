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
public class CustomerBO {

	private long id;
	
	private UserDetailsBO userDetails;
	
	private Date createdDate;
	
	private Date lastUpdatedDate;

	private Set<AppointmentBO> appointments;
	
	private Set<CustomerPaymentBO> customerPayments;
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
	 * @return the appointments
	 */
	public Set<AppointmentBO> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments the appointments to set
	 */
	public void setAppointments(Set<AppointmentBO> appointments) {
		this.appointments = appointments;
	}

	/**
	 * @return the customerPayments
	 */
	public Set<CustomerPaymentBO> getCustomerPayments() {
		return customerPayments;
	}

	/**
	 * @param customerPayments the customerPayments to set
	 */
	public void setCustomerPayments(Set<CustomerPaymentBO> customerPayments) {
		this.customerPayments = customerPayments;
	}
	
	
}
