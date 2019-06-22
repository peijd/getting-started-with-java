package com.ripjava.map;

import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("username", "justin");
        props.setProperty("password", "123456");
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
    }
}
