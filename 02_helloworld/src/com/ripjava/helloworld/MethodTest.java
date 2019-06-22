package com.ripjava.helloworld;

public class MethodTest {
	public static void main(String[] args) {
//		for (int i = 1; i <= 6; i++)
//			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
//		new MethodTest().printHelloWorldTwice();
//		new MethodTest().printHelloWorldThrice();
//		new MethodTest().printHelloWorld(2);
//		new MethodTest().printHelloWorld(3);
		int number = new MethodTest().sumOfTwoNumber(3, 5);
		System.out.println(number);
		
	}

	public void printHelloWorldTwice() {
		System.out.println("Hello World");
		System.out.println("Hello World");
	}

	public void printHelloWorldThrice() {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
	}

	public void printHelloWorld(int numbers) {
		for (int i = 0; i < numbers; i++) {
			System.out.println("Hello World");
		}
	}

	public int sumOfTwoNumber(int n1, int n2) {
		return n1 + n2;
	}

}
