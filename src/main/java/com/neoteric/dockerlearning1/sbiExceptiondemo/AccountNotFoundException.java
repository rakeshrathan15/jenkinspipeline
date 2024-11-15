package com.neoteric.dockerlearning1.sbiExceptiondemo;

public class AccountNotFoundException extends RuntimeException{

    private String code;


    public AccountNotFoundException(String message) {
        super(message);
    }

    public AccountNotFoundException(String code,String message){
        super(message);
        this.code=code;
    }


}
