package com.ripjava.interfaces;

interface Action {
	public static final int TEST_NUMBER = 123;

	public abstract void excute();
	
	public default void excutedefault() {
		System.out.println("默认的一些操作");
	}
}

class SomeAction implements Action {

	@Override
	public void excute() {
		System.out.println("一些操作");

	}

}

public class MainAction {
	public static void main(String[] args) {
		
		SomeAction someAction = new SomeAction();
		someAction.excute();
		someAction.excutedefault();
//		Action.TEST_NUMBER = 11;
//		System.out.println(Action.TEST_NUMBER);
	}
}
