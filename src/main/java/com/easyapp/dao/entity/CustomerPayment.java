/**
 * 
 */
package com.easyapp.dao.entity;

import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.CascadeType;
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
@Table(name = "tbl_customer_payments")
public class CustomerPayment extends BaseEntity {
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "pay_mode_id")
	private PaymentMode paymentMode;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "appointment_id")
	private Appointment appointment;
	
	@Column(name = "transaction_number")
	private String transactionNumber;
	
	@Column(name = "transaction_date")
	private LocalDateTime transactionDate;
	
	@Column(name = "payee_name")
	private String payeeName;
	
	@Column(name = "payment_file")
	private byte[] payment_file;
	
	@Column(name = "payment_file_name")
	private String paymentFileName;
	
	@Column(name = "payment_file_mime_type")
	private String paymentFileMimeType;

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
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(LocalDateTime transactionDate) {
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

	@Override
	public String toString() {
		return "CustomerPayment [paymentMode=" + paymentMode + ", appointment=" + appointment + ", transactionNumber="
				+ transactionNumber + ", transactionDate=" + transactionDate + ", payeeName=" + payeeName
				+ ", payment_file=" + Arrays.toString(payment_file) + ", paymentFileName=" + paymentFileName
				+ ", paymentFileMimeType=" + paymentFileMimeType + "]";
	}

}
