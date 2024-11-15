package com.neoteric.dockerlearning.sbiExceptiondemo;

import java.util.Date;

public  class Payment  {

    private String transcationId;
    private String UTR;
    private Date transcationDate;

    private String status;

    private double amount;

    public String getTranscationId() {
        return transcationId;
    }

    public void setTranscationId(String transcationId) {
        this.transcationId = transcationId;
    }

    public String getUTR() {
        return UTR;
    }

    public void setUTR(String UTR) {
        this.UTR = UTR;
    }

    public Date getTranscationDate() {
        return transcationDate;
    }

    public void setTranscationDate(Date transcationDate) {
        this.transcationDate = transcationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
