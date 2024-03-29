package com.ripjava.collection;

import java.util.*;

public class Guest {
    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String name;
        while(true) {
            System.out.print("访客姓名：");
            name = scanner.nextLine();
            if(name.equals("quit")) {
                break;
            }
            list.add(name);
        }
        System.out.println("所有的访客：");
        foreach(list);
    }

    private static void foreach(List list) {
        for(int i = 0; i < list.size(); i++) {
            String guest = (String) list.get(i);
            System.out.println(guest.toUpperCase());
        }
    }
}
