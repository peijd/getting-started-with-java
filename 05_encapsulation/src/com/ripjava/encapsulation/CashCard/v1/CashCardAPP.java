package com.ripjava.encapsulation.CashCard.v1;

import java.util.Scanner;

public class CashCardAPP {
	public static void main(String[] args) {
		CashCard card1 =CashCard.getInstance("A001", 500, 0);
		CashCard card2 = CashCard.getInstance("A002", 500, 0);

		
		System.out.println(card1 == card2);
//		Scanner scanner = new Scanner(System.in);
//		// card1 存钱
//		card1.store(scanner);
//		card2.store(scanner);
		
//		card1.balance = 100000;
		
	}


}
