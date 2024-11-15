package com.neoteric.dockerlearning.sbiExceptiondemo;

public class Account {

    private String  accountNumber;
    private String  accountHolderName;

    private String IFSCCode;

    private double balance;

    private String adharNumber;
    private String pan;


    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }



    public String getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(String adharNumber) {
        this.adharNumber = adharNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
