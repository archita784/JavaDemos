package com.coforge.inheritance;

public abstract class InMobile implements Insurance {

//	public void vehicleIns() {
	// System.out.println("For Theft");
	// }

	public void peopleIns() {
		System.out.println("For theft ");

	}

}

class InCharger extends InMobile {

	public void vehicleIns() {
		System.out.println("Charging in vehicle ");

	}

}
