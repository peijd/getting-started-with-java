package com.ripjava.io.readerwriter;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharUtil {
    public static void dump(Reader src, Writer dest) throws IOException {
        try(Reader input = src; Writer output = dest) {
            char[] data = new char[1024];
            int length = 0;
            while((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}
