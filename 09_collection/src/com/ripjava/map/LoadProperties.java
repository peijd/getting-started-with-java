package com.ripjava.map;

import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(LoadProperties.class.getResourceAsStream(args[0]));

        System.out.println(props.getProperty("com.ripjava.username"));
        System.out.println(props.getProperty("com.ripjava.password"));
    }
}
