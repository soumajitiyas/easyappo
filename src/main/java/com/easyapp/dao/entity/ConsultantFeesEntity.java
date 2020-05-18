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
@Table(name = "tbl_consultants_fees")
public class ConsultantFeesEntity extends BaseEntity {

	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "consultant_id")
	private ConsultantEntity consultant;
	
	@Column(name = "customer_count")
	private int customerCount;
	
	@Column(name = "fee_amount")
	private double feeAmount;
	
	@Column(name = "fee_type")
	private String feeType;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;

	/**
	 * @return the consultant
	 */
	public ConsultantEntity getConsultant() {
		return consultant;
	}

	/**
	 * @param consultant the consultant to set
	 */
	public void setConsultant(ConsultantEntity consultant) {
		this.consultant = consultant;
	}

	/**
	 * @return the customerCount
	 */
	public int getCustomerCount() {
		return customerCount;
	}

	/**
	 * @param customerCount the customerCount to set
	 */
	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}

	/**
	 * @return the feeAmount
	 */
	public double getFeeAmount() {
		return feeAmount;
	}

	/**
	 * @param feeAmount the feeAmount to set
	 */
	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}

	/**
	 * @return the feeType
	 */
	public String getFeeType() {
		return feeType;
	}

	/**
	 * @param feeType the feeType to set
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
