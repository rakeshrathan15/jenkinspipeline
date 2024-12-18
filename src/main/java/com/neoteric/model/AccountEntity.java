package com.neoteric.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "account",schema = "bank")
@Data
public class AccountEntity {

    public AccountEntity(){

    }

    @Column(name = "name",nullable = false)
    private  String name;

    @Id
    @Column(name = "accountnumber")
    private  String accountnumber;

    @Column(name = "pan",nullable = false)
    private String pan;

    @Column(name = "mobile",nullable = false)
    private String  mobileNumber;

    @Column(name = "balance",nullable = false)
    private double balance;


    // @Column(name = "")



    @OneToMany(mappedBy = "accountEntity",
    cascade = CascadeType.PERSIST,fetch = FetchType.LAZY  )
    public List<AccountAddressEntity> accountAddressEntityList;

    @OneToOne(mappedBy ="accountEntity",
    cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    public AdharEntity adharEntity;

}
