package com.neoteric.entityclasses;

import lombok.Data;

@Data
public class Employee {


    private int id;
    private String name;
    private String dept;

    private double salary;

    private Project project;


}
