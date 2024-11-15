package com.neoteric.dockerlearning.exceptionpractice;

public class PaymentService {
    static  int seats=10;

    public String payment(int numberOfTickets) throws InsufficientBalanceException{
        try {

            if (numberOfTickets > 5) {
                throw new InsufficientBalanceException("Failed");
            }
        }catch (InsufficientBalanceException e){
            System.out.println("insufficicent balance exception");
            throw e;
        }


        return "sucess";

    }


}
