/**
 * 
 */
package com.easyapp.dao.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author DELL
 *
 */

@Entity
@Table(name = "tbl_customer_payments")
public class CustomerPayment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "pay_mode_id")
	private PaymentMode paymentMode;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "appointment_id")
	private Appointment appointment;
	
	@Column(name = "transaction_number")
	private String transactionNumber;
	
	@Column(name = "transaction_date")
	private Date transactionDate;
	
	@Column(name = "payee_name")
	private String payeeName;
	
	@Column(name = "payment_file")
	private byte[] payment_file;
	
	@Column(name = "payment_file_name")
	private String paymentFileName;
	
	@Column(name = "payment_file_mime_type")
	private String paymentFileMimeType;
	
	@Column(name = "created_date")
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
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * @return the appointment
	 */
	public Appointment getAppointment() {
		return appointment;
	}

	/**
	 * @param appointment the appointment to set
	 */
	public void setAppointment(Appointment appointment) {
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
