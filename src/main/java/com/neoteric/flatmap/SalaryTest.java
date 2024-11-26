package com.neoteric.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;


public class SalaryTest {

    public static void main(String[] args) {
//
//        List<Employee> javaEmployees = List.of(
//                new Employee(30000.0, "Rakesh", "1"),
//                new Employee(40000.0, "Lokesh", "2"),
//                new Employee(50000.0, "Pavan", "3"),
//                new Employee(50000.0, "mahesh", "8"),
//                new Employee(50000.0, "suresh", "9")
//        );
//
//        List<Employee> pythonEmployees = List.of(
//                new Employee(45000.0, "Nikhil", "4"),
//                new Employee(32000.0, "Varun", "5")
//        );
//
//        List<Employee> projectManagerEmployees = List.of(
//                new Employee(80000.0, "Suresh", "6"),
//                new Employee(75000.0, "Mahesh", "7")
//        );
//
//        // Create departments
//        List<Department> departmentList = List.of(
//                new Department(javaEmployees, "Java Developer"),
//                new Department(pythonEmployees, "Python Developer"),
//                new Department(projectManagerEmployees, "Project Manager")
//        );

//      List<String> employeeIdList=  javaEmployees.stream().map(Employee::getEmployeeId).collect(Collectors.toList());
//
//      //  departmentList.stream().map(Employee::getEmployeeId).collect(Collectors.toList());
//
//
//        System.out.println("Employee Id "+employeeIdList);
//
//        List<String> employeeIdnotagoodpractice=  javaEmployees.stream().map(employee -> employee.getEmployeeId()).collect(Collectors.toList());
//
//        System.out.println("employeeIdnotagoodpractice "+ employeeIdnotagoodpractice);
//        System.out.println("Average Salary by Department:");
//        departmentList.forEach(department -> {
//            OptionalDouble average = department.getEmpoloyees().stream()
//                    .mapToDouble(Employee::getSalary)
//                    .average();
//            System.out.println(department.getDepartmentName() + ": " + average.orElse(0.0));
//        });
//
//
//        System.out.println("Maximum Salary by Department:");
//        departmentList.forEach(department -> {
//            double max = department.getEmpoloyees().stream()
//                    .mapToDouble(Employee::getSalary)
//                    .max()
//                    .orElse(0.0);
//            System.out.println(department.getDepartmentName() + ": " + max);
//        });
//
//
//        System.out.println("Minimum Salary by Department:");
//        departmentList.forEach(department -> {
//            double min = department.getEmpoloyees().stream()
//                    .mapToDouble(Employee::getSalary)
//                    .min()
//                    .orElse(0.0);
//            System.out.println(department.getDepartmentName() + ": " + min);
//        });
//
//
//        System.out.println("Company-wide Salaries:");
//        List<Employee> allEmployees = departmentList.stream()
//                .flatMap(department -> department.getEmpoloyees().stream())
//                .toList();
//
//        double highestSalary = allEmployees.stream()
//                .mapToDouble(Employee::getSalary)
//                .max()
//                .orElse(0.0);
//
//        double lowestSalary = allEmployees.stream()
//                .mapToDouble(Employee::getSalary)
//                .min()
//                .orElse(0.0);
//
//        System.out.println("Highest Salary: " + highestSalary);
//        System.out.println("Lowest Salary: " + lowestSalary);
//
//
//
//       Map<String,Double> departartmentAverageSalary= javaEmployees.stream().collect(groupingBy(Employee::getEmployeeId,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(" departmentAverageSalary"+departartmentAverageSalary);
//
//        departmentList.stream().collect(Collectors.toList());

    }
}
