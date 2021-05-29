
package com.coforge.inheritance;

public class InterfaceVehicle implements Insurance {
	String name;
	double price;

	public void vehicleIns() {
		System.out.println("For Bikes");

	}

	public void peopleIns() {
		System.out.println("For Medical Insurance");

	}
}
