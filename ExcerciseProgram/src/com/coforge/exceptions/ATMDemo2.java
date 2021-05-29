package com.coforge.exceptions;

class Bankk {
	void witdraw(int amount) {
		System.out.println("in bank");
		try {
			int balance = 1000 / amount;

			System.out.println("balance " + balance);
		} catch (ArithmeticException e) {
			System.out.println("error");
			throw e;
		}finally {
			System.out.println("close");
		}
	System.out.println("bank done");
	}
}

public class ATMDemo2 {
	public static void main(String[] args) {
		try {
			System.out.println("Welcome");

			String value = args[0];

			int num = Integer.parseInt(value);
			System.out.println(num);

			Bankk bank = new Bankk();
			bank.witdraw(num);
			System.out.println("Amount withdrawn");

		} catch (Exception e) {
			System.out.println("please try again");
		}
		System.out.println("Good day");

	}
}
