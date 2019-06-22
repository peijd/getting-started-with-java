package com.ripjava.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringComparator2 implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class Sort6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
        Collections.sort(words, new StringComparator2());
        System.out.println(words);
    }
}
