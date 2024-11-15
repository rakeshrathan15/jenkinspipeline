package com.neoteric.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Employee> hashMap = new HashMap<>();


        hashMap.put("E101", new Employee("John Doe", 28, "IT"));
        hashMap.put("E102", new Employee("Alice Smith", 35, "HR"));
        hashMap.put("E103", new Employee("Bob Johnson", 42, "Finance"));


        for (Map.Entry<String, Employee> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
