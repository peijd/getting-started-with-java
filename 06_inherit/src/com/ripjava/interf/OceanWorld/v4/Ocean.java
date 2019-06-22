package com.ripjava.interf.OceanWorld.v4;

public class Ocean {
	public static void doSwim(Swimmer swimmer) {
		swimmer.swim();
	}

	public static void main(String[] args) {
		doSwim(new Anemonefish("小鱼儿"));
		doSwim(new Shark("沙克"));
		doSwim(new Human("贾维斯"));
		doSwim(new Submarine("唐山一号"));

		doSwim(new Seaplane("空軍零號"));
		doSwim(new FlyingFish("甚平"));
	}
}
