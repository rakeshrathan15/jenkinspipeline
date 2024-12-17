package com.neoteric.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompareArrayLists {
    public static void main(String[] args) {
        // Step 1: Initialize two ArrayLists with 100 random integers
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list1.add(random.nextInt(200)); // Random numbers between 0 and 199
            list2.add(random.nextInt(200));
        }

        // Print lists for verification (optional)
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Step 2: Compare using retainAll() and measure time
        List<Integer> tempList1 = new ArrayList<>(list1); // Create a copy to avoid modifying original list
        long startTime = System.nanoTime();

        tempList1.retainAll(list2); // Find common elements

        long endTime = System.nanoTime();
        System.out.println("Common elements: " + tempList1);
        System.out.println("Time taken using retainAll(): " + (endTime - startTime) + " nanoseconds");


    }
}
