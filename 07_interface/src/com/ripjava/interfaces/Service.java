package com.ripjava.interfaces;

interface Some {
	void excetue();

	void doSome();
}

interface Other {
	void excetue();

	void doOther();
}

public class Service implements Some, Other {

	@Override
	public void doOther() {
		System.out.println("doOther");

	}

	@Override
	public void excetue() {
		System.out.println("excetue");

	}

	@Override
	public void doSome() {
		System.out.println("doSome");

	}

	public static void main(String[] args) {
		Some some = new Service();
		some.excetue();
		Other other = new Service();
		other.excetue();
	}

}
