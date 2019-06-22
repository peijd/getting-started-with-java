package com.ripjava.object.String;

public class OneTo101 {
    public static void main(String[] args) {
    	String text = "";
        for (int i = 1; i < 100; i++) {
        	text = text + i + '+';
        }
        System.out.print(text + 100);
    }
}
