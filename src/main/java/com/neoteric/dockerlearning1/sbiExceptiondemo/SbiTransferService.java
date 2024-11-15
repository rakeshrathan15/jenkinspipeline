package com.neoteric.dockerlearning1.sbiExceptiondemo;



import java.util.Date;
import java.util.UUID;


public abstract class SbiTransferService implements RBI {
    public Boolean balanceCheck(String accountNumber, Double amount) {
        Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
        return accountBalance != null && accountBalance.getBalance() > amount;
    }

    @Override
    public Payment transfer(String fromAccount, String toAccount, double amount) {
        if (!SBIAccountDBService.accountMap.containsKey(fromAccount)) {
            throw new AccountNotFoundException("From account does not exist.");
        }
        if (!SBIAccountDBService.accountMap.containsKey(toAccount)) {
            throw new AccountNotFoundException("To account does not exist.");
        }

        Payment p = new Payment();
        // Balance check
        if (this.balanceCheck(fromAccount, amount)) {
            Account account = SBIAccountDBService.accountMap.get(fromAccount);
            Account account1=SBIAccountDBService.accountMap.get(toAccount);
            // Transaction limit
            if (this.transactionLimitCheck(account, amount)) {
                p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                p.setTranscationId(UUID.randomUUID().toString());
                p.setUTR(UUID.randomUUID().toString());
                p.setTranscationDate(new Date());
                p.setAmount(amount);
            }
            else {
                throw  new InsufficientBalanceException(TransferEnum.INSUFFICIENT_BALANCE.getCode(), TransferEnum.INSUFFICIENT_BALANCE.getLabel());
            }
        } else {
            throw new RuntimeException();
        }

        return p;
    }




   protected abstract boolean transactionLimitCheck(Account account, Double amount);



}
