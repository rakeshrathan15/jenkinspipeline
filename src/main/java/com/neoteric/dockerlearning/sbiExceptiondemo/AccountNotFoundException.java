package com.neoteric.dockerlearning.sbiExceptiondemo;

public class AccountNotFoundException extends Exception{

    private String code;


    public AccountNotFoundException(String message) {
        super(message);
    }

    public AccountNotFoundException(String code,String message){
        super(message);
        this.code=code;
    }


}
