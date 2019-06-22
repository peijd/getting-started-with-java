package com.ripjava.object.classObject;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int i = sc.nextInt();
		System.out.println(i);
		sc.close();
	}
}
