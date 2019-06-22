package com.ripjava.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil3 {
    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(name));
            while(scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append('\n');
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw  ex;
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
        return builder.toString();
    }
}
