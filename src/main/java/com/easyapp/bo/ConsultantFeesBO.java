/**
 * 
 */
package com.easyapp.bo;

import java.util.Date;

/**
 * @author DELL
 *
 */
public class ConsultantFeesBO {

	private long id;
	
	private ConsultantBO consultant;
	
	private int customerCount;
	
	private double feeAmount;
	
	private String feeType;
	
	private Date startDate;
	
	private Date endDate;
	
	private Date createdDate;
	
	private Date lastUpdatedDate;

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
	 * @return the consultant
	 */
	public ConsultantBO getConsultant() {
		return consultant;
	}

	/**
	 * @param consultant the consultant to set
	 */
	public void setConsultant(ConsultantBO consultant) {
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

	/**
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
	
}
