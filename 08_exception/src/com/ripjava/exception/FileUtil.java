package com.ripjava.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
    public static String readFile(String name) {
        StringBuilder builder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new FileInputStream(name));
            while(scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append('\n');
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return builder.toString();
    }
}
