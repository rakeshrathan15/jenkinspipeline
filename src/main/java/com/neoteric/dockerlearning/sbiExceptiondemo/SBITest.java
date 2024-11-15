package com.neoteric.dockerlearning.sbiExceptiondemo;

public class SBITest {

 //   double a=10;


    public static void main(String[] args) {

        RetailAccountServiceImpl retailAccountService = new RetailAccountServiceImpl();
        Account a = retailAccountService.createAccount("1234", "22222");

        SbiTransferService neftsbiTransferService = new NEFTSBITransferServiceImpl();
        try {
            neftsbiTransferService.transfer(a.getAccountNumber(),"1234", 1000);
            System.out.println(" transfer succcessfull");
        } catch (InsufficientBalanceException | AccountNotFoundException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }
}
