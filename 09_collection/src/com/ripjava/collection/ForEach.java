package com.ripjava.collection;

import java.util.*;

public class ForEach {
    private static void forEach(Iterable iterable) {
        for(Object o : iterable) {
            System.out.println(o);
        }
    }
    
	private static void forEachIterable(Iterable iterable) {
		Iterator iterator = iterable.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
    
    private static void forEach( List list) {
        for(int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
    
    private static void forEachFunction(Collection collection) {
    	collection.forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        List list = Arrays.asList("Justin", "Monica", "Irene");
        forEachFunction(list);
//        forEach(list);
//        forEach(new HashSet(list));
//        forEach(new ArrayDeque(list));
    }
}
