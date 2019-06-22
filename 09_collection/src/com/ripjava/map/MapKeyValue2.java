package com.ripjava.map;

import java.util.Map;
import java.util.TreeMap;

public class MapKeyValue2 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        foreach(map.entrySet());
    }
    
    public static void foreach(Iterable<Map.Entry<String, String>> iterable) {
        for(Map.Entry<String, String> entry: iterable) {
            System.out.printf("(Key %s, Value %s)%n", 
                    entry.getKey(), entry.getValue());
        }
    }
}
