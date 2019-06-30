package com.ripjava.io.readerwriter;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

public class CharUtilDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/Users/jundongpei/Downloads/copy.txt");
        StringWriter writer = new StringWriter();
        CharUtil.dump(reader, writer);
        System.out.println(writer.toString());
    }
} 	
