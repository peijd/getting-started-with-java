package com.ripjava.interfaces;

interface SAction {
	void excetue();
}

interface SSome extends SAction{

	void doSome();
}

interface SOther extends SAction{
	void excetue();

	void doOther();
}

public class Service2 implements SSome, SOther {

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
		SSome some = new Service2();
		some.excetue();
		SOther other = new Service2();
		other.excetue();
	}

}
