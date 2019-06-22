package com.ripjava.OceanWorld.v5;

public class Helicopter extends Airplane {
    public Helicopter(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.printf("飞机 %s 在飞%n", name);
    }
}
