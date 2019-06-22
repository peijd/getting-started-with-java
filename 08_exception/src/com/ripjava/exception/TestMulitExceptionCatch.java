package com.ripjava.exception;

import java.io.IOException;

public class TestMulitExceptionCatch {
	public static void main(String[] args) {
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
