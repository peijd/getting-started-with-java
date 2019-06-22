package com.ripjava.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		String s = "test";
		// String class = "test";

		String format = "%d * %d = %2d";

//		System.out.printf(format, a, b, a * b);
//		a = a + 1;
//		System.out.printf(format, a, b, a * b);
//		a++;
//		System.out.printf(format, a, b, a * b);
//		a += 1;
//		System.out.printf(format, a, b, a * b);
//		a = a + 1;
//		System.out.printf(format, a, b, a * b);
//		a = a + 1;
//		System.out.printf(format, a, b, a * b);
//
//		a = a + 1;
//		System.out.printf(format, a, b, a * b);
//		a = a + 1;
//		System.out.printf(format, a, b, a * b);
//		a = a + 1;
//		System.out.printf(format, a, b, a * b);
//		a = a + 1;
//		System.out.printf(format, a, b, a * b);
//		a = a + 1;
//		System.out.printf(format, a, b, a * b);
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				if (j > 3) break;
				System.out.printf("%d * %d = %2d ", i, j, i * j);
			}
			System.out.println();
		}
		
		// 0b 二进制
		// 0  八进制
		// 0x 十六进制
		// 1-9 十进制
		
		// 二进制
		//  1  -> 1
		//  10 -> 2
		//  11 -> 3
		//  100 -> 4
		
		//  八进制
		//  7  -> 7
		//  8  -> 10
		//  9  -> 11
		//  16 -> 20
		
		
		// 十六进制
		// a -> 10
		// b -> 11
		// f -> 15
		// 10-> 16
		
		// 下划线 Java SE 7 
//		int d = 1_000_000;
//		
		int x = 40;
		int y = 30;
//		
//		if(x == 30) {
//			System.out.println("x = 30");
//			if(y == 10) {
//				System.out.println("x = 30 y  = 10");
//			} else {
//				System.out.printf("x = 30 y = %d", y);
//			}
//		} else {
//			System.out.printf("x = %d y = %d", x , y);
//		}
		
		
//		if(x != 30 ||  y == 10 ) {
//			System.out.printf("x = %d y = %d", x , y);
//		} else {
//			System.out.println("-----------");
//		}
		
		if( returnTrue() && returnFalse() ) {
			System.out.println("all false");
		}else if(returnTrue() || returnFalse()){
			System.out.println("one  True one false");
		}else {
			System.out.println("all  false");
		}
		

	}
	
	
	public static boolean returnTrue() {
		System.out.println("return true");
		return true;
	}
	
	
	
	public static boolean returnFalse() {
		System.out.println("return false");
		return false;
	}
	
	
	
	
	

}
