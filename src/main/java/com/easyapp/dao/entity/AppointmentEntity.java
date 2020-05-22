/**
 * 
 */
package com.easyapp.dao.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

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
@Table(name = "tbl_appointment")
public class AppointmentEntity extends BaseEntity {
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "consultant_id")
	private ConsultantEntity consultant;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "client_id")
	private ClientEntity client;
	
	@Column(name = "appointment_date")
	private LocalDateTime appointmentDate;
	
	@Column(name = "appointment_start_time")
	private LocalTime appointmentStartTime;

	@Column(name = "appointment_end_time")
	private LocalTime appointmentEndTime;

	@Column(name = "status")
	private String status;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "new_appointment_id")
	private AppointmentEntity newAppointment;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "appointment_id")
	private AppointmentSummaryEntity appointmentSummary;

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
	 * @return the client
	 */
	public ClientEntity getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(ClientEntity client) {
		this.client = client;
	}

	/**
	 * @return the appointmentDate
	 */
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}

	/**
	 * @param appointmentDate the appointmentDate to set
	 */
	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	/**
	 * @return the appointmentStartTime
	 */
	public LocalTime getAppointmentStartTime() {
		return appointmentStartTime;
	}

	/**
	 * @param appointmentStartTime the appointmentStartTime to set
	 */
	public void setAppointmentStartTime(LocalTime appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}

	/**
	 * @return the appointmentEndTime
	 */
	public LocalTime getAppointmentEndTime() {
		return appointmentEndTime;
	}

	/**
	 * @param appointmentEndTime the appointmentEndTime to set
	 */
	public void setAppointmentEndTime(LocalTime appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
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
	 * @return the appointmentSummary
	 */
	public AppointmentSummaryEntity getAppointmentSummary() {
		return appointmentSummary;
	}

	/**
	 * @param appointmentSummary the appointmentSummary to set
	 */
	public void setAppointmentSummary(AppointmentSummaryEntity appointmentSummary) {
		this.appointmentSummary = appointmentSummary;
	}

	@Override
	public String toString() {
		return "AppointmentEntity [consultant=" + consultant + ", client=" + client + ", appointmentDate="
				+ appointmentDate + ", appointmentStartTime=" + appointmentStartTime + ", appointmentEndTime="
				+ appointmentEndTime + ", status=" + status + ", newAppointment=" + newAppointment
				+ ", appointmentSummary=" + appointmentSummary + "]";
	}
	

}
