package com.coforge.inheritance;

public class Current extends Account {

	public Current(double balance) {
		super(balance);

	}

	@Override
	void withDraw(int amount) {
		System.out.println("Current balance: " + balance);
		balance = balance - amount;

	}

	@Override
	void deposit(int amount) {
		System.out.println("current deposit: " + balance);
		balance = balance + amount;

	}

	void checkIntrest() {
		System.out.println();
	}

}
