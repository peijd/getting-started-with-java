package com.ripjava.collection;

import java.util.Arrays;

public class SArrayList {
	private Object[] list;
	private int size = 0;

	private static final int CAPACITY_SIZE = 10;

	public SArrayList() {
		this.list = new Object[CAPACITY_SIZE];
	}
	
	public SArrayList(int capacity) {
		this.list = new Object[capacity];
	}

	public void add(Object o) {
		if(size + 1  > list.length ) {
			list = Arrays.copyOf(list, list.length * 2);
		}
		
		list[size] = o;
		size++;
	}
	
	
	public Object get(int index) {
		return list[index];
		
	}
	
	
	public int size() {
		return size;
	}
	
	
	public static void main(String[] args) {
		SArrayList sList = new SArrayList();
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		sList.add("String1");
		System.out.println(sList.size());
		System.out.println(sList.get(sList.size() - 1));
		
		
	}
}
