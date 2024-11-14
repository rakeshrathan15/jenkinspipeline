package com.neoteric.dockerlearning;

import java.util.ArrayList;
import java.util.Collection;

public class Collectiondemo {

    public static void main(String[] args) {

        Collection collection= new ArrayList();
        collection.add(5);
        collection.add(1);
        collection.add(34);

        System.out.println(collection);
    }
}
