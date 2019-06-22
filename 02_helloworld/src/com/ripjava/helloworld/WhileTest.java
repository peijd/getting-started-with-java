package com.ripjava.helloworld;

public class WhileTest {
	public static void main(String[] args) {
		int x = 1;
		while (x < 1) {
			System.out.println("while" + x);
			x++;
		}

		x = 1;
		do {
			System.out.println("do while " + x);
			x++;
		} while (x < 1);

		x = 1;
		for (; x <= 10; ) {
			System.out.println(x + 1);
			
			if(x > 5) continue;
			x = x + 1;
		}

	}
}
