package com.ripjava.thread;

import java.net.URL;
import java.io.*;

public class Download2 {
    public static void main(String[] args) throws Exception {
    	final long start = System.currentTimeMillis();
    	// 为了测试结束的时间，添加了一个JVM关闭的钩子。 
    	Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run()
			{	
				final long stop = System.currentTimeMillis();
				System.out.println(stop - start);
			}
		}));
    	
    	
    	
        final URL[] urls = {
                new URL("https://www.scala-lang.org/"),
                new URL("https://developer.mozilla.org/zh-CN/docs/Web/JavaScript"),
                new URL("https://www.python.org/"),
                new URL("https://groovy-lang.org/")
            };
            
        final  String[] fileNames = {
                "Scala.html",
                "JavaScript.html",
                "Python.html",
                "Groovy.html"
            };

        for(int i = 0; i < urls.length; i++) {
            final int index = i;
            new Thread() {
                @Override
                public void run() {
                    try {
                        dump(urls[index].openStream(), new FileOutputStream(fileNames[index]));
                    } catch(IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }.start();
        }
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
