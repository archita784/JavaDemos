package com.coforge.inheritance;

public class InferDemo {
	public static void main(String[] args) {
		Insurance ins = new InterfaceVehicle();
		ins.peopleIns();
		ins.vehicleIns();

		ins = new InCharger();
		ins.peopleIns();
		ins.vehicleIns();

	}

}
