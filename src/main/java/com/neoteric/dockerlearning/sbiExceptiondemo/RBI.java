package com.neoteric.dockerlearning.sbiExceptiondemo;

public interface RBI {

   Payment transfer(String fromAccount,String toAccount,double amount) throws InsufficientBalanceException, AccountNotFoundException;




}
