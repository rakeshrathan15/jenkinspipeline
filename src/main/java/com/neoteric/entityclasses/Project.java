package com.neoteric.entityclasses;

import lombok.Data;

import java.util.Date;

@Data
public class Project {

    private  int id;
    private  String projectname;
    private Date startdate;
    private  Date enddate;

    private Employee employee;



}
