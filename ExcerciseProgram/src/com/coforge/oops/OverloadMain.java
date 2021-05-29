package com.coforge.oops;

import java.util.Scanner;

class EmployeeOver {
	String name;
	String designation;

	public EmployeeOver(String name, String designation) {

		this.name = name;
		this.designation = designation;
	}

	double calcBonus(double allowance) {
		return allowance;

	}

	double calcbonus(double basic, double carAllowance) {
		return basic + carAllowance;
	}

	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		return basicAllowance + carAllowance + houseAllowance;
	}
}

public class OverloadMain {
	public static void main(String[] args) {
		System.out.println("Enter Details");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String designation = sc.next();

		EmployeeOver employee = new EmployeeOver(name, designation);
		if (designation.equals ("Programmer") )
				{
			System.out.println(name+" Total allowance "+ employee.calcBonus(5000));
		} else if (designation.equals("Manager"))
				{
			System.out.println(name+ " Total allowance "+employee.calcbonus(6500, 3000));
		} else if(designation.equals("Director"))
			{
			System.out.println(name+" Total allowance "+ employee.calcBonus(6500, 2000, 2000));
			}
		else
			System.out.println("wrong entry");

	}
	
}
