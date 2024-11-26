package com.neoteric.flatmap;

import java.util.*;

public class HighestSalary {

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


        Iterator<Employee> employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()) {
            Employee emp = employeeIterator.next();
            String department = emp.getDepartment();
            double salary = emp.getSalary();


            if (departmentMaxSalary.containsKey(department)) {
                double currentMaxSalary = departmentMaxSalary.get(department);
                departmentMaxSalary.put(department, Math.max(currentMaxSalary, salary));
            } else {
                // Initialize the department with the current salary
                departmentMaxSalary.put(department, salary);
            }
        }


        Iterator<Map.Entry<String, Double>> entryIterator = departmentMaxSalary.entrySet().iterator();
        System.out.println("Highest salary by department:");
        while (entryIterator.hasNext()) {
            Map.Entry<String, Double> entry = entryIterator.next();
            System.out.println("Department: " + entry.getKey() + ", Highest Salary: " + entry.getValue());
        }


        double highestSalary = Double.MIN_VALUE;
        double lowestSalary = Double.MAX_VALUE;

        // Use an Iterator to traverse through the employee list
        Iterator<Employee> employeeIterator1 = employeeList.iterator();
        while (employeeIterator1.hasNext()) {
            Employee emp = employeeIterator1.next();
            double salary = emp.getSalary();

            // Update highest and lowest salaries
            if (salary > highestSalary) {
                highestSalary = salary;
            }
            if (salary < lowestSalary) {
                lowestSalary = salary;
            }
        }

        // Output the results
        System.out.println("Highest Salary in the Company: " + highestSalary);
        System.out.println("Lowest Salary in the Company: " + lowestSalary);
    }










}
