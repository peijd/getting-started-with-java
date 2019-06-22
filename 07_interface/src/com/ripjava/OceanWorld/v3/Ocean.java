package com.ripjava.OceanWorld.v3;

public class Ocean {
    public static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
    
    public static void main(String[] args) {
		doSwim(new Anemonefish("小鱼儿"));
		doSwim(new Shark("沙克"));
		doSwim(new Human("贾维斯"));
		doSwim(new Submarine("唐山一号"));
    }
}
