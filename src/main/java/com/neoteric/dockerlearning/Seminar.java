package com.neoteric.dockerlearning;

public class Seminar {


    static int a=10;

    static int b=demo();
    static int c=20;


    static {

        System.out.println("from static block 1");
    }
    static int demo()
    {

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);


        return 30;
    }
    public static void main(String[] args) {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);



    }


    static {

        System.out.println("from static block 2 ");
    }
}
