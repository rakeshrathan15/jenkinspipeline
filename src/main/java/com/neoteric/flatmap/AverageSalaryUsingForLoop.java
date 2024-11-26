package com.neoteric.flatmap;

import java.util.*;
import java.util.stream.Collectors;

public class AverageSalaryUsingForLoop {

    public static void main(String[] args) {
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



      //  List<String> employeeIdList=  javaEmployees.stream().map(Employee::getEmployeeId).collect(Collectors.toList());

        List<Employee> employeeList= new ArrayList<>();

        Employee firstEmployee=new Employee(6000.0,"Tharun","11","Java Developer");
        Employee secondEmployee=new Employee(4000.0,"Kumar","12","Phython Developer");
        Employee thirdEmployee=new Employee(5000.0,"Anil","13","Java Developer");
        Employee fourthEmployee=new Employee(5000.0,"Dinesh","14","Phython Developer");

        employeeList.add(firstEmployee);
        employeeList.add(secondEmployee);
        employeeList.add(thirdEmployee);
        employeeList.add(fourthEmployee);

        Map<String,Double> deptAvgSalaryMap = new HashMap<>();
        Map<String,Integer> deptEmpCountMap = new HashMap<>();

        Iterator<Employee> employeeIterator = employeeList.iterator();

        while (employeeIterator.hasNext()){
            Employee emp = employeeIterator.next();
            if (deptAvgSalaryMap.containsKey(emp.getDepartment())){
                Double d = deptAvgSalaryMap.get(emp.getDepartment());
                Double total = d+emp.getSalary();
                deptAvgSalaryMap.put(emp.getDepartment(),total);
                int count=   deptEmpCountMap.get(emp.getDepartment());
                int totalCount = count+1;
                deptEmpCountMap.put(emp.getDepartment(),totalCount);
            }else {
                deptAvgSalaryMap.put(emp.getDepartment(),emp.getSalary());
                deptEmpCountMap.put(emp.getDepartment(),1);
            }
        }

        System.out.println("total salary "+deptAvgSalaryMap);

        System.out.println("total count "+deptEmpCountMap);

        Iterator<String> deptIterator =  deptAvgSalaryMap.keySet().iterator();

        while(deptIterator.hasNext()){
            String dept = deptIterator.next();

            Double totalSalary =   deptAvgSalaryMap.get(dept);
            int totalCount  =    deptEmpCountMap.get(dept);

            System.out.println(" Avg salary by dept" +totalSalary/totalCount);
        }

        Map<String,Double> departmentLowestSalary = new HashMap<>();
        while (employeeIterator.hasNext()){
               Employee employee   =  employeeIterator.next();

               if(departmentLowestSalary.containsKey(employee.getDepartment())){
                   double currentMinSalary =  departmentLowestSalary.get(employee.getDepartment());
                      departmentLowestSalary.put(employee.getDepartment(), Math.min(currentMinSalary, employee.getSalary()));

               }else {
                   departmentLowestSalary.put(employee.getDepartment(), employee.getSalary());
               }
        }

        System.out.println("Lowest Salary ");



        Iterator<Map.Entry<String,Double>> entryIterator= departmentLowestSalary.entrySet().iterator();


        while (entryIterator.hasNext()){
            Map.Entry<String ,Double> doubleMapEntry= entryIterator.next();

            System.out.println("hello"+doubleMapEntry.getKey()+doubleMapEntry.getValue());


        }


































    }
}
