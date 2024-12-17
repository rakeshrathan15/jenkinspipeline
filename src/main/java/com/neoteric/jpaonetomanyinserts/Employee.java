package com.neoteric.jpaonetomanyinserts;


import lombok.Data;

@Data
public class Employee {


    private int id;
    private String name;
    private String dept;
    private String state;

    private double salary;

    private int pid;


}
