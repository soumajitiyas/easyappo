/**
 * 
 */
package com.easyapp.dao.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name = "tbl_consultant")
@PrimaryKeyJoinColumn(name = "user_id")
@DiscriminatorValue("CONSULTANT")
public class ConsultantEntity extends UserEntity{

	@Column(name = "user_id", insertable = false, updatable = false)
	private Long userId;

	@Column(name = "status")
	private String status;
	
	@Column(name = "year_of_experience")
	private int yearOfExperience;
		
	@Column(name = "slot_time")
	private int slotTime;
	
	@Column(name = "fee_amount")
	private double feeAmount;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "consultant")
	private Set<ConsultantDailyScheduleEntity> consultantDailySchedules;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "consultant")
	private Set<ConsultantUnavailableSlotEntity> consultantUnAvailableSlots;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "tbl_consultant_client", 
        joinColumns = { @JoinColumn(name = "consultant_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "client_id") }
    )
	private Set<ClientEntity> clients;
	/**
	 * @return the slotTime
	 */
	public int getSlotTime() {
		return slotTime;
	}

	/**
	 * @param slotTime the slotTime to set
	 */
	public void setSlotTime(int slotTime) {
		this.slotTime = slotTime;
	}

	/**
	 * @return the consultantDailySchedules
	 */
	public Set<ConsultantDailyScheduleEntity> getConsultantDailySchedules() {
		return consultantDailySchedules;
	}

	/**
	 * @param consultantDailySchedules the consultantDailySchedules to set
	 */
	public void setConsultantDailySchedules(Set<ConsultantDailyScheduleEntity> consultantDailySchedules) {
		this.consultantDailySchedules = consultantDailySchedules;
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
	 * @return the yearOfExperience
	 */
	public int getYearOfExperience() {
		return yearOfExperience;
	}

	/**
	 * @param yearOfExperience the yearOfExperience to set
	 */
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
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
	 * @return the consultantUnvailableSlots
	 */
	public Set<ConsultantUnavailableSlotEntity> getConsultantUnAvailableSlots() {
		return consultantUnAvailableSlots;
	}

	/**
	 * @param consultantUnAvailableSlots the consultantUnvailableSlots to set
	 */
	public void setConsultantUnAvailableSlots(Set<ConsultantUnavailableSlotEntity> consultantUnAvailableSlots) {
		this.consultantUnAvailableSlots = consultantUnAvailableSlots;
	}

	/**
	 * @return the clients
	 */
	public Set<ClientEntity> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(Set<ClientEntity> clients) {
		this.clients = clients;
	}


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}


}
