package com.ripjava.collection;

import java.util.Arrays;

public class SimpleArrayList {
	
	/*
	 * 数组默认初始化长度
	 */
	private static final int DEFAULT_CAPACITY = 10;
    private Object[] list;
    private int next;
    
    public SimpleArrayList() {
        this(DEFAULT_CAPACITY);
    }
   
    public SimpleArrayList(int capacity) {
        list = new Object[capacity];
    }
    
    public void add(Object o) {
        if(next == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = o;
    }
    
    public Object get(int index) {
        return list[index];
    }
    
    public int size() {
        return next;
    }
    
}
