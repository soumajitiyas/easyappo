package com.easyapp.dao.entity;

import javax.persistence.*;

@Entity(name = "tbl_otp")
public class OtpEntity extends BaseEntity{

    @Column(name = "reference_id")
    private String referenceId;
    @Column(name = "otp")
    private String otp;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;
    @Column(name = "context")
    private String context;
    @Column(name = "status")
    private String status;
    @Column(name = "retryCount")
    private int retryCount;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    /**
	 * @return the user
	 */
	public UserEntity getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserEntity user) {
		this.user = user;
	}

	public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    @Override
    public String toString() {
        return "OtpEntity{" +
                "referenceId='" + referenceId + '\'' +
                ", otp='" + otp + '\'' +
                ", user=" + user +
                ", context='" + context + '\'' +
                ", status='" + status + '\'' +
                ", retryCount=" + retryCount +
                '}';
    }
}
