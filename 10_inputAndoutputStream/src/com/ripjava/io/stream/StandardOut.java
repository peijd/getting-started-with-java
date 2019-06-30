package com.ripjava.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StandardOut {
    public static void main(String[] args) throws IOException {
        try (PrintStream printStream = new PrintStream(
                new FileOutputStream("/Users/jundongpei/Downloads/StandardOutTest_20190629.txt "))) {
            System.setOut(printStream);
            
            
            System.out.println("HelloWorld");
        }
    }
}
