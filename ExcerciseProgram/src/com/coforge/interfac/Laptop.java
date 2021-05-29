package com.coforge.interfac;

public class Laptop extends Gadgets implements Insurancee {

	public Laptop(String modelName, double price) {
		super(modelName, price);

	}

	public void showAccessories() {
		System.out.println("USB");
		
	}

	public void getInsDetails() {
		System.out.println("Insurance");
	}

	public void showAccesories() {
		System.out.println("Mic");
		
	}

	@Override
	public void getdiscountedPrice(int amount) {
		System.out.println(price-amount);
		
	}

	

	
}
