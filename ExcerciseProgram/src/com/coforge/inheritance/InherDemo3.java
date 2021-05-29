package com.coforge.inheritance;

public class InherDemo3 {
	public static void main(String[] args) {
		Car car = new Car("honda", "city", 1000000, " stearing");
		car.getDetails();
		car.showAccesories();

		Bike bike = new Bike("splendr", "specialedition", 85000, 25);
		bike.getDetails();
		bike.showMilege();

	}

}
