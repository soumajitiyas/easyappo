package com.easyapp.domain;

import com.easyapp.dao.entity.UserEntity;
import com.easyapp.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;


@Domain
public class User {

    @Autowired
    UserRepository userRepository;

    private UserEntity userEntity;


    public String getType() {
        return userEntity.getType();
    }


    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.userEntity.setType(type);
    }


    /**
     * @return the dateOfBirth
     */
    public LocalDateTime getDateOfBirth() {
        return userEntity.getDateOfBirth();
    }


    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        userEntity.setDateOfBirth(dateOfBirth);
    }


    /**
     * @return the firstName
     */
    public String getFirstName() {
        return this.userEntity.getFirstName();
    }


    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.userEntity.setFirstName(firstName);
    }


    /**
     * @return the lastName
     */
    public String getLastName() {
        return this.userEntity.getLastName();
    }


    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.userEntity.setLastName(lastName);
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return this.userEntity.getEmail();
    }


    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.userEntity.setEmail(email);
    }


    /**
     * @return the gender
     */
    public String getGender() {
        return this.getGender();
    }


    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.userEntity.setGender(gender);
    }


    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return this.userEntity.getCountryCode();
    }


    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.userEntity.setCountryCode(countryCode);
    }


    /**
     * @return the primaryNumber
     */
    public String getPrimaryNumber() {
        return this.userEntity.getPrimaryNumber();
    }


    /**
     * @param primaryNumber the primaryNumber to set
     */
    public void setPrimaryNumber(String primaryNumber) {
        this.userEntity.setPrimaryNumber(primaryNumber);
    }


    /**
     * @return the altNumberCountryCode
     */
    public String getAltNumberCountryCode() {
        return this.userEntity.getAltNumberCountryCode();
    }


    /**
     * @param altNumberCountryCode the altNumberCountryCode to set
     */
    public void setAltNumberCountryCode(String altNumberCountryCode) {
        this.userEntity.setAltNumberCountryCode(altNumberCountryCode);
    }


    /**
     * @return the alternateNumber
     */
    public String getAlternateNumber() {
        return this.userEntity.getAlternateNumber();
    }


    /**
     * @param alternateNumber the alternateNumber to set
     */
    public void setAlternateNumber(String alternateNumber) {
        this.userEntity.setAlternateNumber(alternateNumber);
    }


    /**
     * @return the isEmailVerified
     */
    public boolean isEmailVerified() {
        return this.userEntity.isEmailVerified();
    }


    /**
     * @param isEmailVerified the isEmailVerified to set
     */
    public void setEmailVerified(boolean isEmailVerified) {
        this.userEntity.setEmailVerified(isEmailVerified);
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return this.userEntity.getAddress1();
    }


    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.userEntity.setAddress1(address1);
    }


    /**
     * @return the address2
     */
    public String getAddress2() {
        return this.userEntity.getAddress2();
    }


    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.userEntity.setAddress2(address2);
    }


    /**
     * @return the state
     */
    public String getState() {
        return this.userEntity.getState();
    }


    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.userEntity.setState(state);
    }


    /**
     * @return the city
     */
    public String getCity() {
        return this.userEntity.getCity();
    }


    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.userEntity.setCity(city);
    }


    /**
     * @return the pincode
     */
    public String getPincode() {
        return this.userEntity.getPincode();
    }


    /**
     * @param pincode the pincode to set
     */
    public void setPincode(String pincode) {
        this.userEntity.setPincode(pincode);
    }


    /**
     * @return the landmark
     */
    public String getLandmark() {
        return this.userEntity.getLandmark();
    }


    /**
     * @param landmark the landmark to set
     */
    public void setLandmark(String landmark) {
        this.userEntity.setLastName(landmark);
    }


    @Override
    public String toString() {
        return "User{" +
                "user=" + userEntity +
                '}';
    }
}
