/**
 * 
 */
package com.easyapp.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name = "tbl_payment_modes_master")
public class PaymentMode extends BaseEntity {

	@Column(name = "payment_mode")
	private String paymentMode;
	
	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "PaymentMode [paymentMode=" + paymentMode + "]";
	}

}
