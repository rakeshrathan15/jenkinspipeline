package com.neoteric.dockerlearning.sbiExceptiondemo;

import java.util.Date;
import java.util.UUID;

public class NEFTSBITransferServiceImpl extends SbiTransferService{


    @Override
    protected boolean transactionLimitCheck(Account account, Double amount) {

        System.out.println("  Validating transactionLimitCheck for account in NEFTSBITransferServiceImpl"+account.getAccountNumber());

        if (amount < 10000){

            return true;
        }
        else {
            return  false;
        }
    }











//    @Override
//    public Payment transfer(String fromAccount, String toAccount, double amount) {
//
//
//        Payment p = new Payment();
//        if (this.balanceCheck(fromAccount,amount)) {
//            Account account =   SBIAccountDBService.accountMap.get(fromAccount);            // transaction limit
//            if(this.transactionLimitCheck(account,amount)){
//                p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
//                p.setTranscationId(UUID.randomUUID().toString());
//                p.setUTR(UUID.randomUUID().toString());
//                p.setTranscationDate(new Date());
//                p.setAmount(amount);
//
//            }
//        }
//
//        if (true){
//            System.out.println("  even this if is executed even after insufficient balance as well");
//        }
//        return  p;
//    }


}
