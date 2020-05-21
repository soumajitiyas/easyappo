package com.easyapp.dao.entity;

import javax.persistence.*;

@Entity(name = "tbl_otp")
public class OtpEntity extends BaseEntity{

    @Column(name = "reference_id")
    private String referenceId;
    @Column(name = "otp")
    private String otp;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private CustomerEntity customer;
    @Column(name = "context")
    private String context;
    @Column
    private String status;
    @Column
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

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
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
                ", customer=" + customer +
                ", context='" + context + '\'' +
                ", status='" + status + '\'' +
                ", retryCount=" + retryCount +
                '}';
    }
}
