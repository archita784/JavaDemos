package com.coforge.exceptions;

class Bankkk {
	void witdraw(int amount) throws Exception {
		System.out.println("in bank");
		try {
			if (amount > 1000) {
				System.out.println("amount less");
				throw new Exception("should be less then 0");
			} else {
				int balance = 1000 - amount;
				System.out.println("balance " + balance);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error" + e.getMessage());
			throw e;
		} finally {
			System.out.println("close");
		}
		System.out.println("bank done");
	}
}

public class ATMDemo3 {
	public static void main(String[] args) {
		try {
			System.out.println("Welcome");

			String value = args[0];

			int num = Integer.parseInt(value);
			System.out.println(num);

			Bankkk bank = new Bankkk();
			bank.witdraw(num);
			System.out.println("Amount withdrawn");

		} catch (Exception e) {
			System.out.println("please try again");
		}
		System.out.println("Good day");

	}
}
