package com.neoteric.flatmap;

import java.util.*;

public class MiniSalary {


    public static void main(String[] args) {




        List<Employee> employeeList= new ArrayList<>();

        Employee firstEmployee=new Employee(60000.0,"Tharun","11","Java Developer");
        Employee secondEmployee=new Employee(40000.0,"Kumar","12","Phython Developer");
        Employee thirdEmployee=new Employee(5000.0,"Anil","13","Java Developer");
        Employee fourthEmployee=new Employee(5000.0,"Dinesh","14","Phython Developer");

        employeeList.add(firstEmployee);
        employeeList.add(secondEmployee);
        employeeList.add(thirdEmployee);
        employeeList.add(fourthEmployee);


        Map<String,Double> departmentMinSalary= new HashMap<>();


         Iterator<Employee> employeeIterator= employeeList.iterator();
         while (employeeIterator.hasNext()){

         Employee emp= employeeIterator.next();
         String department = emp.getDepartment();
         double salary = emp.getSalary();

         if (departmentMinSalary.containsKey(department)){
             double currentminisalary=departmentMinSalary.get(department);

             departmentMinSalary.put(department,Math.min(currentminisalary,salary));

         }else {
             // Initialize the department with the current salary
             departmentMinSalary.put(department, salary);
         }




   }
        Iterator<Map.Entry<String,Double>>  entryIterator=departmentMinSalary.entrySet().iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String,Double> entry= entryIterator.next();


            System.out.println("Department: " + entry.getKey() + ", Lowest Salary: " + entry.getValue());



        }


    }
}
