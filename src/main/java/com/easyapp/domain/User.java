package com.easyapp.domain;

import com.easyapp.dao.entity.UserEntity;

import java.time.LocalDateTime;

public class User {
    private UserEntity user;

    public String getType() {
        return user.getType();
    }


    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.user.setType(type);
    }


    /**
     * @return the dateOfBirth
     */
    public LocalDateTime getDateOfBirth() {
        return user.getDateOfBirth();
    }


    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        user.setDateOfBirth(dateOfBirth);
    }


    /**
     * @return the firstName
     */
    public String getFirstName() {
        return this.user.getFirstName();
    }


    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.user.setFirstName(firstName);
    }


    /**
     * @return the lastName
     */
    public String getLastName() {
        return this.user.getLastName();
    }


    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.user.setLastName(lastName);
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return this.user.getEmail();
    }


    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.user.setEmail(email);
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
        this.user.setGender(gender);
    }


    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return this.user.getCountryCode();
    }


    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.user.setCountryCode(countryCode);
    }


    /**
     * @return the primaryNumber
     */
    public String getPrimaryNumber() {
        return this.user.getPrimaryNumber();
    }


    /**
     * @param primaryNumber the primaryNumber to set
     */
    public void setPrimaryNumber(String primaryNumber) {
        this.user.setPrimaryNumber(primaryNumber);
    }


    /**
     * @return the altNumberCountryCode
     */
    public String getAltNumberCountryCode() {
        return this.user.getAltNumberCountryCode();
    }


    /**
     * @param altNumberCountryCode the altNumberCountryCode to set
     */
    public void setAltNumberCountryCode(String altNumberCountryCode) {
        this.user.setAltNumberCountryCode(altNumberCountryCode);
    }


    /**
     * @return the alternateNumber
     */
    public String getAlternateNumber() {
        return this.user.getAlternateNumber();
    }


    /**
     * @param alternateNumber the alternateNumber to set
     */
    public void setAlternateNumber(String alternateNumber) {
        this.user.setAlternateNumber(alternateNumber);
    }


    /**
     * @return the isEmailVerified
     */
    public boolean isEmailVerified() {
        return this.user.isEmailVerified();
    }


    /**
     * @param isEmailVerified the isEmailVerified to set
     */
    public void setEmailVerified(boolean isEmailVerified) {
        this.user.setEmailVerified(isEmailVerified);
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return this.user.getAddress1();
    }


    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.user.setAddress1(address1);
    }


    /**
     * @return the address2
     */
    public String getAddress2() {
        return this.user.getAddress2();
    }


    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.user.setAddress2(address2);
    }


    /**
     * @return the state
     */
    public String getState() {
        return this.user.getState();
    }


    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.user.setState(state);
    }


    /**
     * @return the city
     */
    public String getCity() {
        return this.user.getCity();
    }


    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.user.setCity(city);
    }


    /**
     * @return the pincode
     */
    public String getPincode() {
        return this.user.getPincode();
    }


    /**
     * @param pincode the pincode to set
     */
    public void setPincode(String pincode) {
        this.user.setPincode(pincode);
    }


    /**
     * @return the landmark
     */
    public String getLandmark() {
        return this.user.getLandmark();
    }


    /**
     * @param landmark the landmark to set
     */
    public void setLandmark(String landmark) {
        this.user.setLastName(landmark);
    }


    @Override
    public String toString() {
        return "User{" +
                "user=" + user +
                '}';
    }
}
