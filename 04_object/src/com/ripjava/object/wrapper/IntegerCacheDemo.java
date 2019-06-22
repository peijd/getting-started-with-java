package com.ripjava.object.wrapper;


public class IntegerCacheDemo {

    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = 128;
        if (i1 == i2) {
            System.out.println("i1 == i2");
        }
        else {
            System.out.println("i1 != i2");
        }
    }
}
