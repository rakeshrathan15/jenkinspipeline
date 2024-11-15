package com.neoteric.collections;

import java.util.Map;
import java.util.TreeMap;

public class TrreMap {

    public static void main(String[] args) {

        Map<String, Employee> treeMap = new TreeMap<>();

        treeMap.put("E201", new Employee("Charlie Brown", 29, "Marketing"));
        treeMap.put("E202", new Employee("David White", 38, "Operations"));
        treeMap.put("E203", new Employee("Emma Green", 31, "Sales"));


        for (Map.Entry<String, Employee> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
