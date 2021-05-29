package com.coforge.interfac;

public class BasicCalculator implements Calculator {

	public void add(int a, int b) {
		System.out.println("Sum :"+ (a + b));
	}

	public void product(int a, int b) {
		System.out.println("Product: "+a * b);

	}

	public void difference(int a, int b) {
		System.out.println("Difference: "+(a - b));

	}

	public void divide(int a, int b) {
		System.out.println("Quotient: "+ a / b);

	}

}
