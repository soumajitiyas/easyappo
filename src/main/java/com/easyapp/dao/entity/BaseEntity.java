/**
 * 
 */
package com.easyapp.dao.entity;

import java.time.LocalDateTime;

import javax.persistence.*;


@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
	protected void beforeCreate() {
		if (getCreatedAt() == null) { setCreatedAt(LocalDateTime.now()); }
		if (getUpdatedAt() == null) { setUpdatedAt(LocalDateTime.now()); }
		if (getCreatedBy() == null) { setCreatedBy("EASYAPPO");}
		if (getUpdatedBy() == null) { setUpdatedBy("EASYAPPO");}
	}

	@PreUpdate
	protected void beforeUpdate() {
		if (getCreatedBy() == null) { setCreatedBy("EASYAPPO");}
		if (getUpdatedBy() == null) { setUpdatedBy("EASYAPPO");}
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", createdBy=" + createdBy + ", createdAt=" + createdAt + ", updatedBy="
				+ updatedBy + ", updatedAt=" + updatedAt + "]";
	}

}