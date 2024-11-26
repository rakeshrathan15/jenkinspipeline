package com.neoteric.stramsdemo;

import java.util.*;

public class StudentHasMapTest {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new TreeMap<>();

      //  Student student1= new Student("Telugu",86);

        studentMap.put("Telugu",86);
        studentMap.put("Hindi",80);
        studentMap.put("English",99);
        studentMap.put("Maths",99);
        studentMap.put("Science",96);
        studentMap.put("Social",90);

       Set<Map.Entry<String,Integer>> entrySet =  studentMap.entrySet();
       // set contents ->  Map.Entry<>
        Iterator<Map.Entry<String,Integer>> entryIterator= entrySet.iterator();
//        for (;entryIterator.hasNext();){
//            System.out.println(""+entryIterator.next());
//        }

        while (entryIterator.hasNext()){
           Map.Entry<String,Integer> result= entryIterator.next();
            System.out.println(" Key using iterator "+result.getKey()+" Value using iterator "+result.getValue());
        }

        System.out.println(" ----------------------------------------------");
        System.out.println("------------------------------------------------");
        studentMap.entrySet().stream().forEach(entry ->{
            System.out.println( "Key using Streams "+entry.getKey()+" value using Streams "+ entry.getValue());
        });


    }
}
