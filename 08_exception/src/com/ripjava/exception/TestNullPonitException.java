package com.ripjava.exception;

public class TestNullPonitException {
	public static void main(String[] args) {
		String a =  null;
		try {
			a.charAt(1);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("NullPointerException  test ");
			//e.printStackTrace();
		}
	}
}
