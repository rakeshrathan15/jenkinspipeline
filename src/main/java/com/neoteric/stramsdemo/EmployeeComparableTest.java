package com.neoteric.stramsdemo;

import java.util.*;

public class EmployeeComparableTest {

    public static void main(String[] args) {


        Map<EmployeeComparable,String> comparableMap= new TreeMap<>();

        EmployeeComparable employee1= new EmployeeComparable("Virat","18");
        EmployeeComparable employee2= new EmployeeComparable("Rohit","45");
        EmployeeComparable employee3= new EmployeeComparable("Dhoni","07");

        comparableMap.put(employee1,"Kohil");
        comparableMap.put(employee2,"sharma");
        comparableMap.put(employee3,"MSD");





        Comparator<StudentComparator> byName = Comparator.comparing(StudentComparator::getStudentName);

        // TreeMap with custom comparator
        Map<StudentComparator, String> treeMapByName = new TreeMap<>(byName);

        // Adding students to the TreeMap
        treeMapByName.put(new StudentComparator("Virat", "18"), "India");
        treeMapByName.put(new StudentComparator("Rohit", "45"), "India");
        treeMapByName.put(new StudentComparator("Dhoni", "07"), "India");

        System.out.println("TreeMap sorted by student name:");
        treeMapByName.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Comparator to sort by id
        Comparator<StudentComparator> byId = Comparator.comparing(StudentComparator::getId);

        // TreeMap with custom comparator
        Map<StudentComparator, String> treeMapById = new TreeMap<>(byId);

        // Adding students to the TreeMap
        treeMapById.put(new StudentComparator("Virat", "18"), "India");
        treeMapById.put(new StudentComparator("Rohit", "45"), "India");
        treeMapById.put(new StudentComparator("Dhoni", "07"), "India");

        System.out.println("\nTreeMap sorted by student ID:");
        treeMapById.forEach((key, value) -> System.out.println(key + " -> " + value));
    }




    }

