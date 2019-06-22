package com.ripjava.map;

import java.util.*;

public class Messages2 {
    public static void main(String[] args) {
        Map<String, String> messages = new TreeMap<>(); 
        messages.put("Justin", "hello world");
        messages.put("Monica", "to Monica！");
        messages.put("Irene", "Irene  aaaa！");
        System.out.println(messages);
    }
}
