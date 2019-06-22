package com.ripjava.exception;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class MultiCatchDemo {
//	public static void main(String[] args) {
//		try {
//			doSome("one");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch(EOFException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		try {
			doSome("two");
		} catch (FileNotFoundException | EOFException e) {
			e.printStackTrace();
		}
	}

	public static void doSome(String arg) throws FileNotFoundException, EOFException {
		if ("one".equals(arg)) {
			throw new FileNotFoundException();
		} else {
			throw new EOFException();
		}
	}

}
