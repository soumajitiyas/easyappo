/**
 * 
 */
package com.easyapp.bo;

import java.util.Date;

/**
 * @author DELL
 *
 */

public class CustomerPaymentBO {
	
	private long id;
	
	private PaymentModeBO paymentMode;
	
	private AppointmentBO appointment;
	
	private String transactionNumber;
	
	private Date transactionDate;
	
	private String payeeName;
	
	private byte[] payment_file;
	
	private String paymentFileName;
	
	private String paymentFileMimeType;
	
	private Date createdDate;

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
	 * @return the paymentMode
	 */
	public PaymentModeBO getPaymentMode() {
		return paymentMode;
	}

	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(PaymentModeBO paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * @return the appointment
	 */
	public AppointmentBO getAppointment() {
		return appointment;
	}

	/**
	 * @param appointment the appointment to set
	 */
	public void setAppointment(AppointmentBO appointment) {
		this.appointment = appointment;
	}

	/**
	 * @return the transactionNumber
	 */
	public String getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * @param transactionNumber the transactionNumber to set
	 */
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	/**
	 * @return the transactionDate
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * @return the payeeName
	 */
	public String getPayeeName() {
		return payeeName;
	}

	/**
	 * @param payeeName the payeeName to set
	 */
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	/**
	 * @return the payment_file
	 */
	public byte[] getPayment_file() {
		return payment_file;
	}

	/**
	 * @param payment_file the payment_file to set
	 */
	public void setPayment_file(byte[] payment_file) {
		this.payment_file = payment_file;
	}

	/**
	 * @return the paymentFileName
	 */
	public String getPaymentFileName() {
		return paymentFileName;
	}

	/**
	 * @param paymentFileName the paymentFileName to set
	 */
	public void setPaymentFileName(String paymentFileName) {
		this.paymentFileName = paymentFileName;
	}

	/**
	 * @return the paymentFileMimeType
	 */
	public String getPaymentFileMimeType() {
		return paymentFileMimeType;
	}

	/**
	 * @param paymentFileMimeType the paymentFileMimeType to set
	 */
	public void setPaymentFileMimeType(String paymentFileMimeType) {
		this.paymentFileMimeType = paymentFileMimeType;
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
	

}
