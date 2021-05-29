package com.coforge.threads;

public class Bank {
	double calculateInterest(String name, double amount) {
		System.out.println("In bank");
		double interest = (amount * 3 * 2) / 100;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " Interest " + interest);
		return interest;
	}

}
