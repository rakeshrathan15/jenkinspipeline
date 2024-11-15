package com.neoteric.dockerlearning.sbiExceptiondemo;

public class InsufficientBalanceException extends Exception{

    private String code;


   public InsufficientBalanceException(String code,String message){
       super(message);
       this.code=code;

   }




}
