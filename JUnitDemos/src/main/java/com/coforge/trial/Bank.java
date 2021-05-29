package com.coforge.trial;

import com.coforge.exception.NegativeValueException;

public class Bank {
	double balance=2000;
	public double withdraw(int amount) throws NegativeValueException {
		if (amount<0)
			throw new NegativeValueException("negative amount given");
		return balance-amount;
		
	}
	public double deposite(int amount) {
		return balance+amount;
	}

}
