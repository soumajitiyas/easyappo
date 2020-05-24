/**
 * 
 */
package com.easyapp.dao.entity;

import javax.persistence.Column;
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
@Table(name = "tbl_consultant_offline_appointment")
public class ConsultantOfflineAppointment extends BaseEntity {

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "consultant_slot_id")
	private ConsultantUnavailableSlotEntity consultantSlotEntity;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "primary_number")
	private String primaryNumber;

	/**
	 * @return the consultantSlotEntity
	 */
	public ConsultantUnavailableSlotEntity getConsultantSlotEntity() {
		return consultantSlotEntity;
	}

	/**
	 * @param consultantSlotEntity the consultantSlotEntity to set
	 */
	public void setConsultantSlotEntity(ConsultantUnavailableSlotEntity consultantSlotEntity) {
		this.consultantSlotEntity = consultantSlotEntity;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the primaryNumber
	 */
	public String getPrimaryNumber() {
		return primaryNumber;
	}

	/**
	 * @param primaryNumber the primaryNumber to set
	 */
	public void setPrimaryNumber(String primaryNumber) {
		this.primaryNumber = primaryNumber;
	}

}
