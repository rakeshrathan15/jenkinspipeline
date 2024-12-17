package com.neoteric.jpaonetomanyinserts;

import com.neoteric.insertjdbc.Employee;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Project {

    private  int id;
    private  String projectname;
    private Date startdate;
    private  Date enddate;

    private List<Employee> employeeList= new ArrayList<>();



}
