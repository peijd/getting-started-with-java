package com.ripjava.OceanWorld.v4;

public class Human implements Swimmer {
    private String name;
    
    public Human(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void swim() {
        System.out.printf("人 %s 游泳%n", name);
    }
    
}
