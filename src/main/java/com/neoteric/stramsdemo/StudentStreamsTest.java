package com.neoteric.stramsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentStreamsTest {

    public static void main(String[] args) {
        Map<String,Integer> studentMap = new TreeMap<>();

        //  Student student1= new Student("Telugu",86);

        studentMap.put("Telugu",86);
        studentMap.put("Hindi",80);
        studentMap.put("English",99);
        studentMap.put("Maths",99);
        studentMap.put("Science",96);
        studentMap.put("Social",90);

    }


}
