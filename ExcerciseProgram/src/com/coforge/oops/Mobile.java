package com.coforge.oops;

public class Mobile {
	String brand;
	String model;
	double price;

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.brand = "OPPO";
		mobile.model = "m2Pro";
		mobile.price = 14000;
		System.out.println(mobile.brand + "\t" + mobile.model + "\t" + mobile.price);

		Mobile mobile1 = new Mobile();
		mobile1.brand = "ONE PLUS";
		mobile1.model = "8t";
		mobile1.price = 49900;
		System.out.println(mobile1.brand + "\t" + mobile1.model + "\t" + mobile1.price);

		Mobile mobile2 = mobile;
		System.out.println(mobile2.brand + "\t" + mobile2.model + "\t" + mobile2.price);
	}

}
