package com.neoteric.stramsdemo;

import com.sun.jdi.request.StepRequest;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMap {


    public static void main(String[] args) {


        //using List
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



     //   System.out.println(result);




        //Using  Map
        Map<String,Employee> employeeMap= new HashMap<>();



        Employee employee6= new Employee("6","Rakesh");
        Employee employee7= new Employee("7","Tharn");
        Employee employee8 = new Employee("8","Arun");
        Employee employee9= new Employee("9","Keerthi");
        Employee employee10= new Employee("10","Madhu");

        employeeMap.put(employee6.getEmployeeId(),employee6);
        employeeMap.put(employee7.getEmployeeId(),employee7);
        employeeMap.put(employee8.getEmployeeId(),employee8);
        employeeMap.put(employee9.getEmployeeId(),employee9);
        employeeMap.put(employee10.getEmployeeId(),employee10);

        Set<Map.Entry<String,Employee>> entrySet= employeeMap.entrySet();

        //this is using iterator
        Iterator<Map.Entry<String,Employee>> entryIterator= entrySet.iterator();

          for(;entryIterator.hasNext();){
              Map.Entry<String,Employee> employeeEntry = entryIterator.next();
              System.out.println(" key "+employeeEntry.getKey() +  "   values  "+employeeEntry.getValue());

          }



          // this is using streams
          employeeMap.entrySet().stream().forEach(mapEntry ->{
              System.out.println("k"+mapEntry.getKey()+"  values "+mapEntry.getValue());
          });
















    }















}
