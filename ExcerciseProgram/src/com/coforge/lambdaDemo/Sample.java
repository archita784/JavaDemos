package com.coforge.lambdaDemo;

public class Sample  {
	public static void main(String[] args) {
		BonusCalculator calc=(amount)->{
			System.out.println("manager "+amount*5);
		};
		BonusCalculator devcalc=( amount)->{
			System.out.println("developer "+amount*3);
		};
		BonusCalculator admincalc=(amount)->{
			System.out.println("admin "+amount*2);
		};
		calc.calculateBonus(3000);
		devcalc.calculateBonus(2000);
		admincalc.calculateBonus(1000);
	}

	

}
