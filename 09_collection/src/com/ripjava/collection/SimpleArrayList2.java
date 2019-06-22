package com.ripjava.collection;

import java.util.Arrays;

public class SimpleArrayList2<E> {
	
	/*
	 * 数组默认初始化长度
	 */
	private static final int DEFAULT_CAPACITY = 10;
    private Object[] list;
    private int next;
    
    public SimpleArrayList2() {
        this(DEFAULT_CAPACITY);
    }
   
    public SimpleArrayList2(int capacity) {
        list = new Object[capacity];
    }
    
    public void add(E o) {
        if(next == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = o;
    }
    
    public E get(int index) {
        return (E)list[index];
    }
    
    public int size() {
        return next;
    }
    
    public static void main(String[] args) {
    	SimpleArrayList2<String> testlist = new SimpleArrayList2<String>();
    	testlist.add("b1");
    	//testlist.add(122);
    	// new后边的尖括号可以不指定具体类型。JDK 7之后
    	SimpleArrayList2<String> testlist2 = new SimpleArrayList2<>();
    	
	}
    
}
