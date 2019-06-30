package com.ripjava.thread;

import java.net.URL;
import java.io.*;

public class Download {
    public static void main(String[] args) throws Exception {
    	long start = System.currentTimeMillis();
        URL[] urls = {
            new URL("https://www.scala-lang.org/"),
            new URL("https://developer.mozilla.org/zh-CN/docs/Web/JavaScript"),
            new URL("https://www.python.org/"),
            new URL("https://groovy-lang.org/")
        };
        
        String[] fileNames = {
            "Scala.html",
            "JavaScript.html",
            "Python.html",
            "Groovy.html"
        };
        
        for(int i = 0; i < urls.length; i++) {
            dump(urls[i].openStream(), new FileOutputStream(fileNames[i]));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
    private static void dump(InputStream src, OutputStream dest)
                               throws IOException {
        try (InputStream input = src; OutputStream output = dest) {
            byte[] data = new byte[1024];
            int length = -1;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}
