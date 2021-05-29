package com.coforge.interfac;

public class CalMain {
	public static void main(String[] args) {
		Calculator calc = new BasicCalculator();
		System.out.println("From basic calculator");
		calc.add(10, 20);
		calc.product(20, 30);
		calc.difference(30, 20);
		calc.divide(20, 10);
		System.out.println("scifi calculator");
		Scientific sci = new Scifi();
		sci.add(10, 20);
		sci.product(20, 30);
		sci.difference(30, 20);
		sci.divide(20, 10);
		sci.square(4);
		sci.cube(3);

	}

}
