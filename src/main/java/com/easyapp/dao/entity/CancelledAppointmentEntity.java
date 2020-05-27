/**
 * 
 */
package com.easyapp.dao.entity;

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
@Table(name = "tbl_cancelled_appointment")
public class CancelledAppointmentEntity extends BaseEntity{

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "appointment_id")
	private AppointmentEntity appointment;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "cancel_reason")
	private String cancelReason;
	
	@Column(name = "cancelled_by")
	private String cancelledBy;

	/**
	 * @return the appointment
	 */
	public AppointmentEntity getAppointment() {
		return appointment;
	}

	/**
	 * @param appointment the appointment to set
	 */
	public void setAppointment(AppointmentEntity appointment) {
		this.appointment = appointment;
	}

	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the cancelReason
	 */
	public String getCancelReason() {
		return cancelReason;
	}

	/**
	 * @param cancelReason the cancelReason to set
	 */
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	/**
	 * @return the cancelledBy
	 */
	public String getCancelledBy() {
		return cancelledBy;
	}

	/**
	 * @param cancelledBy the cancelledBy to set
	 */
	public void setCancelledBy(String cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	@Override
	public String toString() {
		return "CancelledAppointmentEntity [appointment=" + appointment + ", status=" + status + ", cancelReason="
				+ cancelReason + ", cancelledBy=" + cancelledBy + "]";
	}


}
