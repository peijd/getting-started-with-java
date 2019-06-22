package com.ripjava.OceanWorld.v1;

public abstract class Fish  {
    protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void swim();
}
