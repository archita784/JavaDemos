package com.coforge.threads;

class User implements Runnable {
	String name;
	double amount;
	Bank bank;

	public User(String name, double amount, Bank bank) {
		super();
		System.out.println("in cons " + name);
		this.name = name;
		this.amount = amount;
		this.bank=bank;
		Thread t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		synchronized (bank) {

			System.out.println("in run "+name);
			//Bank bank = new Bank();
			bank.calculateInterest(name, amount);
		}
	}
}

public class Rundemoo {
	public static void main(String[] args) {
		System.out.println("hello");
		Bank bank = new Bank();
		User user1 = new User("ram", 8000, bank);
		User user2 = new User("raju", 9000, bank);
		User user3 = new User("rohan", 10000, bank);

	}

}
