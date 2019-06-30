package com.ripjava.io.stream;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
    	//  
        IO.dump(new FileInputStream("/Users/jundongpei/Downloads/copy.txt"), 
        		new FileOutputStream("/Users/jundongpei/Downloads/newcopy_20190629.txt"));
        
    }
}
