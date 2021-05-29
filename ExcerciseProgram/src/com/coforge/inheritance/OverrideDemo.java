package com.coforge.inheritance;

class Product {
	void greetMessage() {
		System.out.println("Welcome");
	}

	void getDesc() {
		System.out.println("Product features");
	}

	void showDiscoutedPrice(int amount) {
		System.out.println(amount + 2);

	}

}

class Stationary extends Product {
	public void getdesc() {
		System.out.println("Stationary");
	}

	public void showDiscountedPrice(int amount) {
		System.out.println("discount" + amount);
	}

}

class Gadgets extends Product {

	@Override
	void getDesc() {
		System.out.println("Gadgets");
	}

	@Override
	void showDiscoutedPrice(int amount) {
		System.out.println(amount);
	}

}

public class OverrideDemo {
	public static void main(String[] args) {
		Product product = new Gadgets();
		product.getDesc();
		product.showDiscoutedPrice(1000);

		product = new Stationary();
		product.getDesc();
		product.showDiscoutedPrice(2000);
	}
}
