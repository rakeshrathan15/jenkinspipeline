package com.neoteric.generics;

import java.util.ArrayList;
import java.util.List;

public class NumberCount {

    public static void main(String[] args) {
     int count =0;
        for (int i=1;i<=60;i++){
            int temp=i;
            while(temp>0)
            {
                if(temp%10==5)
                {
                    System.out.println(i + "======"+"Total count is "+ ++count);
                }
                temp/=10;
            }

        }
    }
}
