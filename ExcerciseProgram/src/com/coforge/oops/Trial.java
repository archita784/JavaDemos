package com.coforge.oops;

class Trial {
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

}
