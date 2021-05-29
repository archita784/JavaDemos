package com.coforge.def;

class Customer implements Benefits,Coverage{

	@Override
	public void customBenefits() {
		System.out.println("Customer Benefits");
		
	}
	/*
	 * public static void greet (){ System.out.println("heloo"); }
	 */

	@Override
	public void medIns() {
		System.out.println("ins for ladies");
		Benefits.super.medIns();
		Coverage.super.medIns();
	}

	@Override
	public void customerBenefits() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
class Emp implements Benefits{

	@Override
	public void customBenefits() {
		System.out.println(" ");
		
	}
	
}
public class DefDemo {
	public static void main(String[] args) {
		Benefits ben=new Customer();
		ben.customBenefits();
		ben.medIns();
		Benefits.greet();
		/*
		 * Customer cn=new Customer(); cn.greet();
		 */
		//Coverage cu = (Coverage)ben;
		//cu.medIns();
		
	}

}
