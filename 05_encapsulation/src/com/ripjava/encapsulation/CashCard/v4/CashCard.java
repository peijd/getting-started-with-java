package com.ripjava.encapsulation.CashCard.v4;

public class CashCard {
	private String number;
	private int balance;
	private int point;

	public CashCard(String number, int balance, int point) {
		this.number = number;
		this.balance = balance;
		this.point = point;
	}

	void store(int money) {
		if (money > 0) {
			this.balance += money;
			if (money >= 1000) {
				this.point += money / 100;
			}
		} else {
			System.out.println("你想干什么？");
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
