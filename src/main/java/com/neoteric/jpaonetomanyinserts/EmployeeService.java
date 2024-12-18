package com.neoteric.jpaonetomanyinserts;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {




    public String insertRecord(Project projectDetails){

        try{

            EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("jpaDemo");
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            entityManager.getTransaction().begin();

            ProjectEntityJPA project = new ProjectEntityJPA();
            project.setId(projectDetails.getId());
            project.setProjectname(projectDetails.getProjectname());
            project.setStartDate(projectDetails.getStartdate());
            project.setEndDate(projectDetails.getEnddate());

            List<EmployeeEntityJPA> employeeEntities = new ArrayList<>();

            if (projectDetails.getEmployeeList() != null) {
                for (Employee employee : projectDetails.getEmployeeList()) {
                    EmployeeEntityJPA employeeEntity = new EmployeeEntityJPA();
                    employeeEntity.setId(employee.getId());
                    employeeEntity.setName(employee.getName());
                    employeeEntity.setSalary(employee.getSalary());
                    employeeEntity.setDept(employee.getDept());
                    employeeEntity.setProjectEntity(project);



                    employeeEntities.add(employeeEntity);
                }
            }




            project.setEmployeeEntity(employeeEntities);

            entityManager.persist(project);
            entityManager.getTransaction().commit();


            return "inserted successfully";
        }catch (Exception e){
            //entityManager.getTransaction().rollback();
            return "Error inserting record: " + e.getMessage();
        }
    }

}
