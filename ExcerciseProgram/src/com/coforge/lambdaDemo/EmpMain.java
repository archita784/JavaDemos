package com.coforge.lambdaDemo;

public class EmpMain {
	public static void main(String[] args) {
		EmpDetails emp=new EmpDetails();
		
		BonusCalculator manager=(amount)->{
			System.out.println("manager "+amount*5);
		};
		emp.showBonus("rohan", "manager", manager, 5000);
		
		BonusCalculator dev=(amount)->{
			System.out.println("developer "+amount*3);
		};
		emp.showBonus("rohan", "developer", dev, 3000);
		
		BonusCalculator admin=(amount)->{
			System.out.println("admin "+amount*2);
		};
		emp.showBonus("Ram", "admin", admin, 2000);
		
		
		
	}

}
