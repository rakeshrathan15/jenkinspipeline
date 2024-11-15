package com.neoteric.dockerlearning.sbiExceptiondemo;

import java.util.UUID;

public class RetailAccountServiceImpl implements RetailAccountService {
    @Override
    public Account createAccount(String adhar, String pan) {

        Account account = new Account();
        account.setAccountNumber(UUID.randomUUID().toString());
        account.setBalance(1000000.0);
        account.setAdharNumber(adhar);
        account.setPan(pan);
        SBIAccountDBService.accountMap.put(account.getAccountNumber(),account);
        return account;
    }


}
