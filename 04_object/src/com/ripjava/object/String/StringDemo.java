package com.ripjava.object.String;

public class StringDemo {
	public static void main(String[] args) {
		String name = "test";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.toUpperCase());
		
		String num = "123.33";
		double d = Double.parseDouble(num);
//		int i = Integer.parseInt(num);
		System.out.println(d);
	}
}
