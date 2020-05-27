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
@Table(name = "tbl_rescheduled_appointment")
public class RescheduledAppointmentEntity extends BaseEntity{

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "new_appointment_id")
	private AppointmentEntity newAppointment;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "old_appointment_id")
	private AppointmentEntity oldAppointment;
	
	@Column(name = "reschedule_reason")
	private String rescheduleReason;
	
	@Column(name = "rescheduled_by")
	private String rescheduledBy;

	/**
	 * @return the newAppointment
	 */
	public AppointmentEntity getNewAppointment() {
		return newAppointment;
	}

	/**
	 * @param newAppointment the newAppointment to set
	 */
	public void setNewAppointment(AppointmentEntity newAppointment) {
		this.newAppointment = newAppointment;
	}

	/**
	 * @return the oldAppointment
	 */
	public AppointmentEntity getOldAppointment() {
		return oldAppointment;
	}

	/**
	 * @param oldAppointment the oldAppointment to set
	 */
	public void setOldAppointment(AppointmentEntity oldAppointment) {
		this.oldAppointment = oldAppointment;
	}

	/**
	 * @return the rescheduleReason
	 */
	public String getRescheduleReason() {
		return rescheduleReason;
	}

	/**
	 * @param rescheduleReason the rescheduleReason to set
	 */
	public void setRescheduleReason(String rescheduleReason) {
		this.rescheduleReason = rescheduleReason;
	}

	/**
	 * @return the rescheduledBy
	 */
	public String getRescheduledBy() {
		return rescheduledBy;
	}

	/**
	 * @param rescheduledBy the rescheduledBy to set
	 */
	public void setRescheduledBy(String rescheduledBy) {
		this.rescheduledBy = rescheduledBy;
	}

	@Override
	public String toString() {
		return "RescheduledAppointmentEntity [newAppointment=" + newAppointment + ", oldAppointment=" + oldAppointment
				+ ", rescheduleReason=" + rescheduleReason + ", rescheduledBy=" + rescheduledBy + "]";
	}
	
	
	
}
