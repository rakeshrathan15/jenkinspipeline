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
            list1.add(random.nextInt(200));
            list2.add(random.nextInt(200));
        }


        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);


        List<Integer> tempList1 = new ArrayList<>(list1);

        long startTime = System.currentTimeMillis();
        System.out.println("Start Time" +startTime);
        tempList1.retainAll(list2);

        long endTime = System.currentTimeMillis();
        System.out.println("End Time "+endTime);
        // Output results
        System.out.println("Common elements: " + tempList1);
        System.out.println("Time taken using retainAll(): " + (endTime - startTime) + " milliseconds");
    }
}
