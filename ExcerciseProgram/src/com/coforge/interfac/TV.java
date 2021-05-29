package com.coforge.interfac;

public class TV  extends Gadgets{

	public TV(String modelName, double price) {
		super(modelName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getdiscountedPrice(int amount) {
		System.out.println("Discounted price"+(price-amount));
	}

	public void showAccessories() {
		System.out.println("Earphone");
		
	}
	

}
