package com.coforge.inheritance;

public class Vehicle {
	String brand;
	String model;
	int price;

	public Vehicle(String brand, String model, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	void getDetails() {
		System.out.println(brand + " " + model + " " + price);
	}
}

class Car extends Vehicle {
	String acessories;

	public Car(String brand, String model, int price, String acessories) {
		super(brand, model, price);
		this.acessories = acessories;

	}

	void showAccesories() {
		System.out.println(acessories);

	}
}

class Bike extends Vehicle {
	int milege;

	public Bike(String brand, String model, int price, int milege) {
		super(brand, model, price);
		this.milege = milege;

	}

	void showMilege() {
		System.out.println(milege);

	}

}
