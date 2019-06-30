package com.ripjava.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Download {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.ripjava.com");
        InputStream src = url.openStream();
        OutputStream dest = new FileOutputStream("/Users/jundongpei/Downloads/ripjava_20190628.txt");
        IO.dump(src, dest);
    }
}
