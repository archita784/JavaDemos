package com.coforge.def;

public interface Benefits {

	void customBenefits();

	default void medIns() {
		System.out.println("Medical insurance for all");
	}
static void greet() {
	System.out.println("Welcome");
}
}

interface Coverage {
	void customerBenefits();

	default void medIns() {
		System.out.println("Medical  insuracne coverage");
	}
}
