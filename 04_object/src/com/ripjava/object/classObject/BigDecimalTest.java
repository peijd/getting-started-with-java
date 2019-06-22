package com.ripjava.object.classObject;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal(123);
		// 加法
		a = a.add(new BigDecimal(1));
		// 减法
		a = a.subtract(new BigDecimal(2));
		System.out.println(a);
	}
}
