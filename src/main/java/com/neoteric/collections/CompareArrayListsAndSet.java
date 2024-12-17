package com.neoteric.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
public class CompareArrayListsAndSet {
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

        // Step 2: Convert list2 to a HashSet for fast lookups
        Set<Integer> set2 = new HashSet<>(list2);

        // Step 3: Compare using a single loop and measure time
        List<Integer> commonElements = new ArrayList<>();
        long startTime = System.nanoTime();

        for (Integer item : list1) {
            if (set2.contains(item)) { // O(1) lookup in HashSet
                commonElements.add(item);
            }
        }

        long endTime = System.nanoTime();

        // Output the results
        System.out.println("Common elements: " + commonElements);
        System.out.println("Time taken  loops: " + (endTime - startTime) + " nanoseconds");
    }

}
