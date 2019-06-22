
package com.ripjava.map;

import java.util.HashMap;
import java.util.Map;

public class MapKeyValue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        
        System.out.println("key值");
        foreach(map.keySet());
        
        System.out.println("value值");
        foreach(map.values());
    }
    
    public static void foreach(Iterable<String> iterable) {
        for(String element : iterable) {
            System.out.println(element);
        }
    }
}
