package com.ripjava.io.readerwriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharUtil2 {
	public static void dump(Reader src, Writer dest) throws IOException {
		try (Reader input = src; Writer output = dest) {
			char[] data = new char[1024];
			int length = 0;
			while ((length = input.read(data)) != -1) {
				output.write(data, 0, length);
			}
		}
	}

	public static void dump(InputStream src, OutputStream dest, String charset) throws IOException {
		dump(new InputStreamReader(src, charset), new OutputStreamWriter(dest, charset));
	}

	public static void dump(InputStream src, OutputStream dest) throws IOException {
		dump(src, dest, System.getProperty("file.encoding"));
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		CharUtil2.dump(
				new FileInputStream("Main.java"), 
				new FileOutputStream("Main.txt"), 
				"UTF-8");

	}
}
