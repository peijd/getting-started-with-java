package com.ripjava.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class Messages3 {
    public static void main(String[] args) {
        Map<String, String> messages = new TreeMap<>(new StringComparator()); 
        messages.put("Justin", "hello world");
        messages.put("Monica", "to Monica！");
        messages.put("Irene", "Irene  aaaa！");
        System.out.println(messages);
    }
}
