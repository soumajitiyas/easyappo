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
@Table(name = "tbl_appointment_summary")
public class AppointmentSummaryEntity extends BaseEntity{

	//TODO <COMMENT> Same as AppointmentEntity
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "appointment_id")
	private AppointmentEntity appointment;
	
	@Column(name = "notes")
	private String notes;
	
	@Column(name = "rating")
	private String rating;
	
	@Column(name = "review")
	private String review;

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
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}

	/**
	 * @param review the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "AppointmentSummaryEntity [appointment=" + appointment + ", notes=" + notes + ", rating=" + rating
				+ ", review=" + review + "]";
	}
	
	

}
