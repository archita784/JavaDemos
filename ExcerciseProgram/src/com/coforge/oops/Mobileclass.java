package com.coforge.oops;

public class Mobileclass {
	String brand;
	String model;
	double price;
	
	

	public Mobileclass(String brand, String model, double price) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public void getDetails() {
		System.out.println("BrandName= " + brand);
		System.out.println("ModelName= " + model);
		System.out.println("Price= " + price);
	}

	public double showDiscount(int amount) {
		return price - amount;
	}

}
