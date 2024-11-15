package com.neoteric.dockerlearning.garbagecollection;

public class Test {




    public static void main(String[] args) {
        Stud s1= new Stud();
        s1=null;
       // System.out.println(s1);

        System.gc();
        System.out.println(s1.getName());

    }
}
