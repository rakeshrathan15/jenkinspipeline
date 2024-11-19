package com.neoteric.collections;

import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        // Add elements to the LinkedList
        names.add("Rakesh");
        names.add("Lokesh");
        names.add("Charlie");

        System.out.println("LinkedList: " + names);
    }
}
