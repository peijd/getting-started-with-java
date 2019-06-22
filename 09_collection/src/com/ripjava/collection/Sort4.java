package com.ripjava.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort4 {
    public static void main(String[] args) {
        List words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
        Collections.sort(words);
        System.out.println(words);
    }
}
