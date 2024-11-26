package com.neoteric.flatmap;

import java.util.*;

public class MaxSalaryByDepartmentUsingIterator {


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee firstEmployee = new Employee(60000.0, "Tharun", "11", "Java Developer");
        Employee secondEmployee = new Employee(40000.0, "Kumar", "12", "Python Developer");
        Employee thirdEmployee = new Employee(5000.0, "Anil", "13", "Java Developer");
        Employee fourthEmployee = new Employee(5000.0, "Dinesh", "14", "Python Developer");

        employeeList.add(firstEmployee);
        employeeList.add(secondEmployee);
        employeeList.add(thirdEmployee);
        employeeList.add(fourthEmployee);

        Map<String, Double> departmentMaxSalary = new HashMap<>();

        // Use an Iterator to traverse through the employee list
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()) {
            Employee emp = employeeIterator.next();
            String department = emp.getDepartment();
            double salary = emp.getSalary();

            // Update the maximum salary for the department
            if (departmentMaxSalary.containsKey(department)) {
                double currentMaxSalary = departmentMaxSalary.get(department);
                departmentMaxSalary.put(department, Math.max(currentMaxSalary, salary));
            } else {
                // Initialize the department with the current salary
                departmentMaxSalary.put(department, salary);
            }
        }

        // Use an Iterator to traverse and print the results
        Iterator<Map.Entry<String, Double>> entryIterator = departmentMaxSalary.entrySet().iterator();
        System.out.println("Highest salary by department:");
        while (entryIterator.hasNext()) {
            Map.Entry<String, Double> entry = entryIterator.next();
            System.out.println("Department: " + entry.getKey() + ", Highest Salary: " + entry.getValue());
        }
    }
}
