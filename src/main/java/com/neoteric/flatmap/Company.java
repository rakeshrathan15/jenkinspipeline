package com.neoteric.flatmap;

import java.util.List;

public class Company {


    private String companyName;

    private List<Department> departments;

    public Company(String companyName, List<Department> departments) {
        this.companyName = companyName;
        this.departments = departments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
