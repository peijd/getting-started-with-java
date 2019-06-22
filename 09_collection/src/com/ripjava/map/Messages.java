package com.ripjava.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>(); 
        messages.put("Justin", "hello world");
        messages.put("Monica", "to Monica！");
        messages.put("Irene", "Irene  aaaa！");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("获取谁信息：");
        String message = messages.get(scanner.nextLine());
        System.out.println(message);
        System.out.println(messages);
        scanner.close();
    }
}
