package com.neoteric.jdbcconnection;

import java.util.Date;
import java.util.List;

public class Project {


    private  int id;
    private  String pname;
    private Date startdate;
    private  Date enddate;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    private List<Employee> employeeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public Project(int id, String pname, Date startdate, Date enddate, List<Employee> employeeList) {
        this.id = id;
        this.pname = pname;
        this.startdate = startdate;
        this.enddate = enddate;
        this.employeeList = employeeList;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}
