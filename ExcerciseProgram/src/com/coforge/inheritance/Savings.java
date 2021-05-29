package com.coforge.inheritance;

public class Savings extends Account {
	public Savings(double balance) {
		super(balance);

	}

	@Override
	void withDraw(int amount) {
		System.out.println("Balance after withdraw amount: " + balance);
		balance = balance - amount;

	}

	@Override
	void deposit(int amount) {
		System.out.println("Balance after Deposit: " + balance);
		balance = balance + amount + 100;
	}

}
