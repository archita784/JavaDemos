package com.coforge.oops;

public class StaticDemo {
	static int x, y = 20;
	static {
		x = 10;
		System.out.println("Welcome");

	}
	static {
		int y = 100, x = 200;
		System.out.println("sum: " + (x + y));
	}

	static void greet() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		System.out.println("Product: "+ (x*y));
		greet();
	}

}
