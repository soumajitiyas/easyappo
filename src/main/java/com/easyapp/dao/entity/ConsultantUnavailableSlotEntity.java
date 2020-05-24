/**
 * 
 */
package com.easyapp.dao.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name = "tbl_consultant_unavailable_slot")
public class ConsultantUnavailableSlotEntity extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "consultant_id")
	private ConsultantEntity consultant;
	
	@Column(name = "slot_date")
	private LocalDateTime slotDate;
	
	@Column(name = "slot_start_time")
	private LocalTime slotStartTime;

	@Column(name = "slot_end_time")
	private LocalTime slotEndTime;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="consultant_slot_id")
	ConsultantOfflineAppointment consultantOfflineAppointment;
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
	 * @return the slotDate
	 */
	public LocalDateTime getSlotDate() {
		return slotDate;
	}

	/**
	 * @param slotDate the slotDate to set
	 */
	public void setSlotDate(LocalDateTime slotDate) {
		this.slotDate = slotDate;
	}

	/**
	 * @return the slotStartTime
	 */
	public LocalTime getSlotStartTime() {
		return slotStartTime;
	}

	/**
	 * @param slotStartTime the slotStartTime to set
	 */
	public void setSlotStartTime(LocalTime slotStartTime) {
		this.slotStartTime = slotStartTime;
	}

	/**
	 * @return the slotEndTime
	 */
	public LocalTime getSlotEndTime() {
		return slotEndTime;
	}

	/**
	 * @param slotEndTime the slotEndTime to set
	 */
	public void setSlotEndTime(LocalTime slotEndTime) {
		this.slotEndTime = slotEndTime;
	}

	/**
	 * @return the consultantOfflineAppointment
	 */
	public ConsultantOfflineAppointment getConsultantOfflineAppointment() {
		return consultantOfflineAppointment;
	}

	/**
	 * @param consultantOfflineAppointment the consultantOfflineAppointment to set
	 */
	public void setConsultantOfflineAppointment(ConsultantOfflineAppointment consultantOfflineAppointment) {
		this.consultantOfflineAppointment = consultantOfflineAppointment;
	}

}
