package com.ripjava.io.stream;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadStandardOut {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com/");
        InputStream src = url.openStream();
        IO.dump(src, System.err);
    }
}
