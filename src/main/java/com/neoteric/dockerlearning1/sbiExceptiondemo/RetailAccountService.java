package com.neoteric.dockerlearning1.sbiExceptiondemo;

public interface RetailAccountService extends AccountService {

    Account createAccount(String adhar, String pan);

}
