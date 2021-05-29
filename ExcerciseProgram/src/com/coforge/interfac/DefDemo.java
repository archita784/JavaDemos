package com.coforge.interfac;

class Customer implements Insurance, Benefits {

	@Override
	public void vehicleIns() {
		System.out.println("Vehicle insurance for cutomer");

	}

	@Override
	public void customerBenefits() {
		System.out.println("Customer Medical benifits");

	}

	@Override
	public void medIns() {
		System.out.println("medical for old");
		Insurance.super.medIns();
		Benefits.super.medIns();
	}

}

class Vehicle implements Insurance {

	@Override
	public void vehicleIns() {
		System.out.println("vehicle insurance");
		Insurance.super.medIns();

	}

	@Override
	public void medIns() {
		System.out.println("medical for vehical ");
	}

}

public class DefDemo {

	public static void main(String[] args) {
		Insurance ins = new Customer();
		ins.vehicleIns();
		ins.medIns();
		
		Benefits ben=(Benefits) ins ;
		ben.customerBenefits();
		
		ins = new Vehicle();
		ins.vehicleIns();
		ins.medIns();
		
		
	}
}
