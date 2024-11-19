package com.neoteric.stramsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();

        Employee employee1= new Employee("1","Rakesh");
        Employee employee2= new Employee("2","Tharn");
        Employee employee3 = new Employee("3","Arun");
        Employee employee4= new Employee("4","Keerthi");
        Employee employee5= new Employee("6","Madhu");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        List<String> result = employeeList.stream()
                .map(Employee::getEmployeeName)  // map each employee to their name
                .collect(Collectors.toList());  // collect the names into a list


        result.forEach(System.out::println);
    }
}
