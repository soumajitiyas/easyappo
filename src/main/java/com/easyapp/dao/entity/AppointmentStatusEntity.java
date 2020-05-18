/**
 * 
 */
package com.easyapp.dao.entity;

import javax.persistence.*;

/**
 * @author SOUMAJIT
 *
 */
@Entity
@Table(name = "tbl_appointment_status_master")
public class AppointmentStatusEntity extends BaseEntity{

	
	@Column(name = "status_desc")
	private String statusDesc;

	/**
	 * @return the statusDesc
	 */
	public String getStatusDesc() {
		return statusDesc;
	}

	/**
	 * @param statusDesc the statusDesc to set
	 */
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
