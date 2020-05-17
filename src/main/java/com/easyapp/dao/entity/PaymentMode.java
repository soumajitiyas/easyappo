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
 * @author DELL
 *
 */
@Entity
@Table(name = "tbl_payment_modes_master")
public class PaymentMode extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "payment_mode")
	private String paymentMode;
	
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
		return "PaymentMode [id=" + id + ", paymentMode=" + paymentMode + ", getCreatedDate()=" + getCreatedDate()
				+ ", getCreatedBy()=" + getCreatedBy() + ", getLastUpdatedDate()=" + getLastUpdatedDate()
				+ ", getLastUpdatedBy()=" + getLastUpdatedBy() + "]";
	}
	
	

}
