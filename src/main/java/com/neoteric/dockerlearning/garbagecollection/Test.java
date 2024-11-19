package com.neoteric.dockerlearning.garbagecollection;

public class Test {




    public static void main(String[] args) {
        Student s1= new Student();

         Student s2= new Student();
        s1=null;
       // System.out.println(s1);

       // System.gc();
        System.out.println(s1.getName());

    }
}
