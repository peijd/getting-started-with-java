package com.ripjava.collection;

import java.util.HashSet;
import java.util.Set;

class Student {
    private String name;
    private String number;
    Student(String name, String number) {
        this.name = name;
        this.number = number;
    }
    
    @Override
    public String toString()  {
        return String.format("(%s, %s)", name, number);
    }
    
}

public class Students {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Student("Justin", "B835031"));
        set.add(new Student("Monica", "B835032"));
        set.add(new Student("Justin", "B835031"));
        System.out.println(set);
    }
}
