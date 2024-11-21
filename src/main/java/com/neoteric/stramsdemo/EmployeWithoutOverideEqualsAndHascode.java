package com.neoteric.stramsdemo;

import java.util.HashMap;
import java.util.Objects;

public class EmployeWithoutOverideEqualsAndHascode {


    private int id;
    private String name;

    public EmployeWithoutOverideEqualsAndHascode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof EmployeWithoutOverideEqualsAndHascode that)) return false;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        HashMap<EmployeWithoutOverideEqualsAndHascode, String> map = new HashMap<>();
        EmployeWithoutOverideEqualsAndHascode emp1 = new EmployeWithoutOverideEqualsAndHascode(1, "John");
        EmployeWithoutOverideEqualsAndHascode emp2 = new EmployeWithoutOverideEqualsAndHascode(1, "John");


        System.out.println(emp1.equals(emp2)); // false

        // Using in HashMap

        map.put(emp1, "Developer");
        System.out.println(map.get(emp2)); // null

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        System.out.println( emp2.name.hashCode());
        System.out.println(emp1.name.hashCode());
    }
}
