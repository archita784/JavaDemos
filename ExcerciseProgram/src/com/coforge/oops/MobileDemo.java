package com.coforge.oops;

public class MobileDemo {
	public static void main(String[] args) {
		Mobile2 mobile = new Mobile2();
		mobile.brand = "OPPO";
		mobile.model = "m2Pro";
		mobile.price = 14000;
		mobile.getDetails();
		System.out.println(mobile.showDiscount(1000));

		Mobile2 mobile1 = new Mobile2();
		mobile1.brand = "ONE PLUS";
		mobile1.model = "8t";
		mobile1.price = 49900;
		mobile1.getDetails();
		System.out.println(mobile1.showDiscount(3000));
	}

}
