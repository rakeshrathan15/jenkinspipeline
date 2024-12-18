package com.neoteric.jpaonetomanyinserts;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class PlanJPATest {


    public static void main(String[] args) {
//        // Step 1: Create EntityManagerFactory and EntityManager
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaDemo");
//        EntityManager em = entityManagerFactory.createEntityManager();
//
//        EntityTransaction transaction = null;
//
//        try {
//            transaction = em.getTransaction();
//            transaction.begin();
//
//
//            ProjectEntity project = new ProjectEntity();
//            project.setProjectname("Neoteric Project");
//            project.setStartDate(new Date());
//            project.setEndDate(new Date());
//
//
//            EmployeeEntity emp1 = new EmployeeEntity();
//            emp1.setName("John Doe");
//            emp1.setDept("Development");
//            emp1.setSalary(70000);
//            emp1.setState("California");
//            emp1.setProjectEntity(project); // Set the relationship
//
//            EmployeeEntity emp2 = new EmployeeEntity();
//            emp2.setName("Jane Smith");
//            emp2.setDept("QA");
//            emp2.setSalary(60000);
//            emp2.setState("Texas");
//            emp2.setProjectEntity(project); // Set the relationship
//
//            // Add employees to the project
//            List<EmployeeEntity> employees = new ArrayList<>();
//            employees.add(emp1);
//            employees.add(emp2);
//            project.setEmployeeEntity(employees);
//
//            // Persist the project (cascades to employees)
//            em.persist(project);
//
//            transaction.commit(); // Commit the transaction
//
//            System.out.println("Data inserted successfully!");
//
//        } catch (Exception e) {
//            if (transaction != null && transaction.isActive()) {
//                transaction.rollback(); // Rollback the transaction in case of error
//            }
//            e.printStackTrace();
//        } finally {
//            // Close EntityManager and EntityManagerFactory
//            em.close();
//            entityManagerFactory.close();
//        }

 EmployeeService employeeService=new EmployeeService();

        Project project = new Project();
      //  project.setId(3);
        project.setProjectname("neoteric");
        project.setStartdate(new Date());
        project.setEnddate(new Date());

        Employee employee = new Employee();
       // employee.setEmpid(9);
        employee.setName("buddu");
        employee.setDept("IT");
        employee.setSalary(5000);
      //  employee.setPid(3);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);

        project.setEmployeeList(employees);

        String insertRecord = employeeService.insertRecord(project);
        System.out.println(insertRecord);
    }
}
