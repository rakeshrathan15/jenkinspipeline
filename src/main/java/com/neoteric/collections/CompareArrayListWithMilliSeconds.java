package com.neoteric.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class CompareArrayListWithMilliSeconds {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            list1.add(random.nextInt(200)); // Random numbers between 0 and 199
            list2.add(random.nextInt(200));
        }


        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Step 2: Compare using retainAll() and measure time
        List<Integer> tempList1 = new ArrayList<>(list1); // Create a copy to avoid modifying original list

        long startTime = System.currentTimeMillis(); // Record start time in milliseconds
        System.out.println("Start Time" +startTime);
        tempList1.retainAll(list2); // Find common elements

        long endTime = System.currentTimeMillis(); // Record end time in milliseconds
        System.out.println("End Time "+endTime);
        // Output results
        System.out.println("Common elements: " + tempList1);
        System.out.println("Time taken using retainAll(): " + (endTime - startTime) + " milliseconds");
    }
}
