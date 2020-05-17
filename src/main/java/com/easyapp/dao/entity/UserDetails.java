/**
 * 
 */
package com.easyapp.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author SOUMAJIT
 *
 */
@Entity
@Table(name = "tbl_user_details")
public class UserDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "user_type")
	private String userType;
	
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
	
	@Column(name = "alternate_number")
	private String alternateNumber;
	
	@Column(name = "is_email_verified")
	private boolean isEmailVerified;
	
	@Column(name = "is_primary_number_verified")
	private boolean isPrimaryNumberVerified;
	
	@Column(name = "is_alternate_number_verified")
	private boolean isAlternateNumberVerified;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "pincode")
	private String pincode;
	
	@Column(name = "landmark")
	private String landmark;
	
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
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
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

	/**
	 * @return the alternateNumber
	 */
	public String getAlternateNumber() {
		return alternateNumber;
	}

	/**
	 * @param alternateNumber the alternateNumber to set
	 */
	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	/**
	 * @return the isEmailVerified
	 */
	public boolean isEmailVerified() {
		return isEmailVerified;
	}

	/**
	 * @param isEmailVerified the isEmailVerified to set
	 */
	public void setEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}

	/**
	 * @return the isPrimaryNumberVerified
	 */
	public boolean isPrimaryNumberVerified() {
		return isPrimaryNumberVerified;
	}

	/**
	 * @param isPrimaryNumberVerified the isPrimaryNumberVerified to set
	 */
	public void setPrimaryNumberVerified(boolean isPrimaryNumberVerified) {
		this.isPrimaryNumberVerified = isPrimaryNumberVerified;
	}

	/**
	 * @return the isAlternateNumberVerified
	 */
	public boolean isAlternateNumberVerified() {
		return isAlternateNumberVerified;
	}

	/**
	 * @param isAlternateNumberVerified the isAlternateNumberVerified to set
	 */
	public void setAlternateNumberVerified(boolean isAlternateNumberVerified) {
		this.isAlternateNumberVerified = isAlternateNumberVerified;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", userType=" + userType + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", countryCode=" + countryCode + ", primaryNumber=" + primaryNumber
				+ ", alternateNumber=" + alternateNumber + ", isEmailVerified=" + isEmailVerified
				+ ", isPrimaryNumberVerified=" + isPrimaryNumberVerified + ", isAlternateNumberVerified="
				+ isAlternateNumberVerified + ", address1=" + address1 + ", address2=" + address2 + ", state=" + state
				+ ", city=" + city + ", pincode=" + pincode + ", landmark=" + landmark + ", getCreatedDate()="
				+ getCreatedDate() + ", getCreatedBy()=" + getCreatedBy() + ", getLastUpdatedDate()="
				+ getLastUpdatedDate() + ", getLastUpdatedBy()=" + getLastUpdatedBy() + "]";
	}


	
}
