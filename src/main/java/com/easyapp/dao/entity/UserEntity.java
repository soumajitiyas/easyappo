/**
 * 
 */
package com.easyapp.dao.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author SOUMAJIT
 *
 */
@Entity
@Table(name = "tbl_user")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="type",
        discriminatorType = DiscriminatorType.STRING)
public class UserEntity extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "date_of_birth")
	private LocalDateTime dateOfBirth;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "primary_number")
	private String primaryNumber;
	
	@Column(name = "alternate_number_country_code")
	private String altNumberCountryCode;
	
	@Column(name = "alternate_number")
	private String alternateNumber;
	
	@Column(name = "is_email_verified")
	private boolean isEmailVerified;
	
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the dateOfBirth
	 */
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}


	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	 * @return the altNumberCountryCode
	 */
	public String getAltNumberCountryCode() {
		return altNumberCountryCode;
	}


	/**
	 * @param altNumberCountryCode the altNumberCountryCode to set
	 */
	public void setAltNumberCountryCode(String altNumberCountryCode) {
		this.altNumberCountryCode = altNumberCountryCode;
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
		return "UserEntity [firstName=" + firstName + ", lastName=" + lastName + ", type=" + type + ", dateOfBirth="
				+ dateOfBirth + ", email=" + email + ", gender=" + gender + ", countryCode=" + countryCode
				+ ", primaryNumber=" + primaryNumber + ", altNumberCountryCode=" + altNumberCountryCode
				+ ", alternateNumber=" + alternateNumber + ", isEmailVerified=" + isEmailVerified + ", address1="
				+ address1 + ", address2=" + address2 + ", state=" + state + ", city=" + city + ", pincode=" + pincode
				+ ", landmark=" + landmark + "]";
	}

}
