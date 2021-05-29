package com.coforge.oops;

public class Mobile1 {
	String brand;
	String model;
	double price;

	public void getDetails() {
		System.out.println("BrandName= " + brand);
		System.out.println("ModelName= " + model);
		System.out.println("Price= " + price);
	}

	public String greetMessage(String msg) {
		return msg + brand;
	}

	public static void main(String[] args) {
		Mobile1 mobile = new Mobile1();
		mobile.brand = "OPPO";
		mobile.model = "m2Pro";
		mobile.price = 14000;
		mobile.getDetails();
		String message = mobile.greetMessage("Great Brand ");
		System.out.println(message);

		Mobile1 mobile1 = new Mobile1();
		mobile1.brand = "ONE PLUS";
		mobile1.model = "8t";
		mobile1.price = 49900;
		mobile1.getDetails();
		System.out.println(mobile1.greetMessage("No one Brand "));

	}

}
