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
public class AppointmentStatus extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "status_desc")
	private String statusDesc;
	
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
