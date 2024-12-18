package com.neoteric.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Account {

    private  String name;
    private  String accountNumber;

   private String pan;
   private String  mobileNumber;
   private double balance;

   private List<Address> address;

}
