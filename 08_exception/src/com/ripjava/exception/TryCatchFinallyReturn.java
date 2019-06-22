package com.ripjava.exception;

public class TryCatchFinallyReturn {
	public static  int test(boolean flag) {
		try {
			if(flag) {
				return 1;
			}
		} finally {
			System.out.println("finally ");
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(test(true));
	}
}
