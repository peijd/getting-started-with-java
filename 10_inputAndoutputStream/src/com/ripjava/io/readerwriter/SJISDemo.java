package com.ripjava.io.readerwriter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SJISDemo {
	public static void main(String[] args) throws IOException {
		
		
		System.out.println(System.getProperty("file.encoding"));
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream("/Users/jundongpei/Downloads/test.txt"),
				"sjis"));
		// sjis Shift_JIS shift-jis MS932
		String test = null;
		while((test = reader.readLine()) != null) {
			System.out.println(test);
		}
		
		reader.close();
		
		
	}
}
