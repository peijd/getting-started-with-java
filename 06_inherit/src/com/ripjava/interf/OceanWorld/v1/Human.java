package com.ripjava.interf.OceanWorld.v1;

public class Human extends Fish {

	public Human(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.printf("人 %s 游泳%n", name);
	}

}
