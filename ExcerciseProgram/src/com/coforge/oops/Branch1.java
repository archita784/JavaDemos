package com.coforge.oops;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("3%  cl in ban");

	}

	@Override
	void eduLoan() {
		System.out.println("7% el in ban");

	}

	@Override
	void houseLoan() {
		System.out.println("8% hl in ban");

	}

	public void payIntrest() {
		System.out.println("Intrest in branch 1");
	}

}
