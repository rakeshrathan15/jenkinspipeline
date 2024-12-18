package com.neoteric.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CompareArrayListAndSetWithMilliSeconds {

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


        Set<Integer> set2 = new HashSet<>(list2);


        List<Integer> commonElements = new ArrayList<>();
        long startTime = System.currentTimeMillis();

//        for (Integer item : list1) {
//            if (set2.contains(item)) { // O(1) lookup in HashSet
//                commonElements.add(item);
//            }
//        }
        for (int i = 0; i < list1.size(); i++) {
            Integer item = list1.get(i);
            if (set2.contains(item)) {
                commonElements.add(item);
            }
        }

        long endTime = System.currentTimeMillis();
        long timeInMilliseconds = endTime - startTime;

        // Output the results
        System.out.println("Common elements: " + commonElements);
        System.out.println("Time taken: " + timeInMilliseconds + " milliseconds");
    }
}
