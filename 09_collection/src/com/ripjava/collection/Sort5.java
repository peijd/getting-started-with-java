package com.ripjava.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String str1 = (String) o1;
        String str2 = (String) o2;
        return -str1.compareTo(str2);
    }
}

public class Sort5 {
    public static void main(String[] args) {
        List words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
        Collections.sort(words, new StringComparator());
        System.out.println(words);
    }
}
