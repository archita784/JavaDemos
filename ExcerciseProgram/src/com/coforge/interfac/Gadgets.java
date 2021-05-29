package com.coforge.interfac;

public abstract class Gadgets  implements Accessories{
	String modelName;
	double price;
	public Gadgets(String modelName, double price) {
		super();
		this.modelName = modelName;
		this.price = price;
	}

	public void getDetails() {
		System.out.println(modelName+" "+price);
	}
	public abstract void getdiscountedPrice(int amount);
}
