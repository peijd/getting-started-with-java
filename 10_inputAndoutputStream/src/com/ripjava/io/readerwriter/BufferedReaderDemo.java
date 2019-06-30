package com.ripjava.io.readerwriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
			String some = reader.readLine();
			System.out.printf("print: %s", some);
		}
	}
}
