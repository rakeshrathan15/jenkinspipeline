package com.neoteric.dirtyreadproblem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
public class HibernateOnetoMany {

    public static void main(String[] args) {
        // Create session factory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Open session
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create department
        Department department = new Department();
        department.setName("IT");

        // Create employees
        Employee emp1 = new Employee();
        emp1.setName("Alice");
        emp1.setDepartment(department);

        Employee emp2 = new Employee();
        emp2.setName("Bob");
        emp2.setDepartment(department);

        // Set employees in department
        department.setEmployees(Arrays.asList());

        // Save department (cascades to employees)
        session.save(department);

        // Commit and close
        transaction.commit();
        session.close();

        System.out.println("Department and Employees saved successfully!");
    }
}
