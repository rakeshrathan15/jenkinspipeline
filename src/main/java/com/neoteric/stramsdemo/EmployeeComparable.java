package com.neoteric.stramsdemo;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

    private String employeeName;
    private String employeeId;

    public EmployeeComparable(String employeeName, String employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(EmployeeComparable o) {
        return 0;
    }


    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
