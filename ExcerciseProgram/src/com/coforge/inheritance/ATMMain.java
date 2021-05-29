package com.coforge.inheritance;

import java.util.Scanner;

class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	void withDraw(int amount) {
		System.out.println(amount);
	}

	void deposit(int amount) {
		System.out.println(amount);
	}

	double getBalance() {
		return balance;
	}

}

public class ATMMain {
	public static void main(String[] args) {
		System.out.println("Account type Saving or Current");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		Account account;
		if (choice.equals("Saving")) {
			account = new Savings(2000);
			account.withDraw(1000);
			account.getBalance();
			account.deposit(500);

		} else if (choice.equals("Current")) {
			account = new Current(3000);
		} else {

			account = new Account(4000);

		}
		account.withDraw(1000);
		account.getBalance();
		account.deposit(500);
	}
}
