package com.neoteric.dockerlearning.sbiExceptiondemo;

public interface RetailAccountService extends AccountService {

    Account createAccount(String adhar, String pan);

}
