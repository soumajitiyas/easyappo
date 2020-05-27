/**
 * 
 */
package com.easyapp.dao.entity;

import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name = "tbl_client")
@PrimaryKeyJoinColumn(name = "user_id")
@DiscriminatorValue("CLIENT")
public class ClientEntity extends UserEntity {

	@Column(name = "user_id", insertable = false, updatable = false)
	private Long userId;

	@Column(name = "time_of_birth")
	private LocalTime timeOfBirth;
	
	@Column(name = "place_of_birth")
	private String placeOfBirth;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	private Set<AppointmentEntity> appointments;

	@ManyToMany(mappedBy = "clients")
	private Set<ConsultantEntity> consultants;

	/**
	 * @return the timeOfBirth
	 */
	public LocalTime getTimeOfBirth() {
		return timeOfBirth;
	}

	/**
	 * @param timeOfBirth the timeOfBirth to set
	 */
	public void setTimeOfBirth(LocalTime timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}

	
	/**
	 * @return the placeOfBirth
	 */
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	/**
	 * @param placeOfBirth the placeOfBirth to set
	 */
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	/**
	 * @return the appointments
	 */
	public Set<AppointmentEntity> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments the appointments to set
	 */
	public void setAppointments(Set<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}
	

	/**
	 * @return the consultants
	 */
	public Set<ConsultantEntity> getConsultants() {
		return consultants;
	}

	/**
	 * @param consultants the consultants to set
	 */
	public void setConsultants(Set<ConsultantEntity> consultants) {
		this.consultants = consultants;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ClientEntity [timeOfBirth=" + timeOfBirth + ", placeOfBirth=" + placeOfBirth + ", appointments="
				+ appointments + ", consultants=" + consultants + "]";
	}

}
