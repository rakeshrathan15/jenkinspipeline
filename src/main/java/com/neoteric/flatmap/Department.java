package com.neoteric.flatmap;

import java.util.List;

public class Department {
    private List<Employee> employees;

    private String departmentName;

    public Department(List<Employee> employees, String departmentName) {
        this.employees = employees;
        this.departmentName = departmentName;
    }

    public List<Employee> getEmpoloyees() {
        return employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
