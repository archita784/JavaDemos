package com.coforge.interfac;

public class Scifi extends BasicCalculator implements Scientific {

	public void square(int a) {
		System.out.println("Square: "+ a * a);

	}

	public void cube(int a) {
		System.out.println("Cube:" + a * a * a);

	}

}
