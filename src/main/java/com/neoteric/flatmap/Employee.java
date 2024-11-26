package com.neoteric.flatmap;

public class Employee {

    private  double salary;


    private String employeeName;

    private String employeeId;

    private String department;



    public Employee(double salary, String employeeName, String employeeId,String department) {
        this.salary = salary;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.department=department;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }
}
