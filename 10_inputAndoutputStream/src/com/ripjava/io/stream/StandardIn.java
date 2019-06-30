package com.ripjava.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StandardIn {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/jundongpei/Downloads/copy.txt"));
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
