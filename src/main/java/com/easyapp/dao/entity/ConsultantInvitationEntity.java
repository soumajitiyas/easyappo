/**
 * 
 */
package com.easyapp.dao.entity;

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
@Table(name = "tbl_consultant_invitation")
public class ConsultantInvitationEntity extends BaseEntity {

	//TODO <Comment> ManyToOne, remove cascade
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "consultant_id")
	private ConsultantEntity consultant;
	
	@Column(name = "client_email")
	private String clientEmail;
	
	@Column(name = "primary_number_country_code")
	private String primaryNumberCountryCode;
	
	@Column(name = "client_primary_number")
	private String clientPrimaryNumber;
	
	@Column(name = "invitation_url")
	private String invitationUrl;
	
	@Column(name = "invitation_status")
	private String invitationStatus;

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
	 * @return the clientEmail
	 */
	public String getClientEmail() {
		return clientEmail;
	}

	/**
	 * @param clientEmail the clientEmail to set
	 */
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	/**
	 * @return the primaryNumberCountryCode
	 */
	public String getPrimaryNumberCountryCode() {
		return primaryNumberCountryCode;
	}

	/**
	 * @param primaryNumberCountryCode the primaryNumberCountryCode to set
	 */
	public void setPrimaryNumberCountryCode(String primaryNumberCountryCode) {
		this.primaryNumberCountryCode = primaryNumberCountryCode;
	}

	/**
	 * @return the clientPrimaryNumber
	 */
	public String getClientPrimaryNumber() {
		return clientPrimaryNumber;
	}

	/**
	 * @param clientPrimaryNumber the clientPrimaryNumber to set
	 */
	public void setClientPrimaryNumber(String clientPrimaryNumber) {
		this.clientPrimaryNumber = clientPrimaryNumber;
	}

	/**
	 * @return the invitationUrl
	 */
	public String getInvitationUrl() {
		return invitationUrl;
	}

	/**
	 * @param invitationUrl the invitationUrl to set
	 */
	public void setInvitationUrl(String invitationUrl) {
		this.invitationUrl = invitationUrl;
	}

	/**
	 * @return the invitationStatus
	 */
	public String getInvitationStatus() {
		return invitationStatus;
	}

	/**
	 * @param invitationStatus the invitationStatus to set
	 */
	public void setInvitationStatus(String invitationStatus) {
		this.invitationStatus = invitationStatus;
	}

	@Override
	public String toString() {
		return "ConsultantInvitationEntity [consultant=" + consultant + ", clientEmail=" + clientEmail
				+ ", primaryNumberCountryCode=" + primaryNumberCountryCode + ", clientPrimaryNumber="
				+ clientPrimaryNumber + ", invitationUrl=" + invitationUrl + ", invitationStatus=" + invitationStatus
				+ "]";
	}
	
	
}
