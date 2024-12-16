package com.neoteric.insertjdbc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCTest {

    public static void main(String[] args) {
        List<Project> projectList= new ArrayList<>();
        Project avoota= new Project();
        avoota.setProjectname("avoota");
        avoota.setStartdate(new Date());
        avoota.setEnddate(new Date());

        Project bookmyshow= new Project();
        bookmyshow.setProjectname("bookmyshow");
        bookmyshow.setStartdate(new Date());
        bookmyshow.setEnddate(new Date());

        projectList.add(avoota);
        projectList.add(bookmyshow);

        Employee rakesh= new Employee();
        rakesh.setName("Rakesh");
        rakesh.setDept("CSE");
        rakesh.setSalary(50000);
        rakesh.setState("TG");

        Employee pavan= new Employee();
        pavan.setName("pavan");
        pavan.setDept("IT");
        pavan.setSalary(50000);
        pavan.setState("TG");



        Employee varun= new Employee();
        varun.setName("varun");
        varun.setDept("CSE");
        varun.setSalary(50000);
        varun.setState("TG");

        avoota.getEmployeeList().add(pavan);

        avoota.getEmployeeList().add(varun);

        avoota.getEmployeeList().add(rakesh);

        Employee lokesh= new Employee();
        lokesh.setName("lokesh");
        lokesh.setDept("IT");
        lokesh.setSalary(500000);
        lokesh.setState("NEW YORK");

        Employee rahul= new Employee();
        rahul.setName("rahul");
        rahul.setDept("IT");
        rahul.setSalary(60000);
        rahul.setState("NEW YORK");

        Employee naveen= new Employee();
        naveen.setName("naveen");
        naveen.setDept("IT");
        naveen.setSalary(40000);
        naveen.setState("NEW YORK");

        bookmyshow.getEmployeeList().add(lokesh);
        bookmyshow.getEmployeeList().add(rahul);
        bookmyshow.getEmployeeList().add(naveen);









        JDBCParentInsertService jdbcParentInsertService= new JDBCParentInsertService();
        jdbcParentInsertService.saveProject(projectList);




    }
}
