package com.ripjava.object.String;

public class OneTo100 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.print(i);
			if (i != 100) {
				System.out.print("+");
			}
		}
	}
}
