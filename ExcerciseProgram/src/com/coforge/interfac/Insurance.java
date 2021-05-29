package com.coforge.interfac;

public interface Insurance {
	void vehicleIns();

	default void medIns() {
		System.out.println("medical insurance");
	}
}
interface Benefits{

	void customerBenefits();

	default void medIns() {
		System.out.println(" ");
	}

}
