package com.coforge.oops;

public class StaticTrial {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("bike");
		vehicle.setPrice(100000);
		String name = vehicle.getName();
		System.out.println(name);
		System.out.println(vehicle.getPrice());
	}

}
