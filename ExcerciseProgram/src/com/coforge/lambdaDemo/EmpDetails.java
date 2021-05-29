package com.coforge.lambdaDemo;

public class EmpDetails {

	void showBonus(String name, String desg, BonusCalculator c, int amount) {
		System.out.println("welcome"+name);
		System.out.println("Designation"+desg);
		c.calculateBonus(amount);
	}

}
