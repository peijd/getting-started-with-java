package com.ripjava.encapsulation.CashCard.v1;

import java.util.Scanner;

public class CashCard {
	

	private String number;
	private int balance;
	private int point;
	
	private static CashCard card;

	public CashCard(String number, int balance, int point) {
		super();
		this.number = number;
		this.balance = balance;
		this.point = point;
	}
	public CashCard(String number, int balance) {
		this(number, balance, 0);
	}




	public static CashCard getInstance(String number, int balance, int point) {
		if(card == null) {
			card = new CashCard(number, balance, point);
		}
		return card;
	}

	public void store(Scanner scanner) {
		System.out.println("请输入您要存的金额:");
		int money = scanner.nextInt();
		if (money > 0) {
			this.balance += money;
			if (money >= 1000) {
				this.point += money / 100;
			}
		} else {
			System.out.println("你想⼲干什什么？");
		}
	}

	public String getNumber() {
		return number;
	}

	public int getBalance() {
		return balance;
	}

	public int getPoint() {
		return point;
	}

}
