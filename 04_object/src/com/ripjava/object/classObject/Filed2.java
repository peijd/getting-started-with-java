package com.ripjava.object.classObject;

class Clothes2 {
    String color; // 颜色
    char size; // 尺寸
    
    // 构造方法
    public Clothes2(String color, char size) {
    	this.color = color;
    	this.size = size;
    }
    
}

public class Filed2 {
    public static void main(String[] args) {
        Clothes2 c1 = new Clothes2("red", 'S');
        Clothes2 c2 = new Clothes2("green", 'M');

        System.out.printf("c1 (%s %c)%n", c1.color, c1.size);
        System.out.printf("c2 (%s %c)%n", c2.color, c2.size);
    }
}
