package com.neoteric.generics;

import com.neoteric.collections.Employee;

import java.util.Map;

public   class MethodLevelGenerics<K,V> implements MapGenerics<K,V> {


    public <K>  void add( K element){

        System.out.println("Hello");
    }

  //  public abstract  <K,V> String addTwoNumber();

  // public abstract  <K,V> String addTwoNumber(String name);



    public <K,V> String add(K element,V name){
        return "Hello ";
    }

    public <K,V> String add(K element,V name,String id){
        return  "Hello world";
    }

    @Override
    public String put(K key, V value) {
        return null;
    }


    // MapGenerics<Integer, Employee>  mapGenerics= new //


}
