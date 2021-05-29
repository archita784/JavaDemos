package com.coforge.exceptions;

import java.util.Scanner;

class Validation {

	boolean checkName(String CName) throws Exception {
		String[] names = { "Ram", "Shyam" };
		for (String name : names) {
			if (CName.equalsIgnoreCase(name)) {
				throw new Exception("Register already");
			}

		}
		return true;
	}
}

public class Register {
	public static void main(String[] args) {
		System.out.println("Perform validation");
		
		Scanner sc=new Scanner(System.in);
		String names=sc.next();
		sc.close();
try {
		Validation valid = new Validation();
		boolean samename=valid.checkName(names);
		if (samename) {
			System.out.println("not registered");
		}
		/*
		 * else { System.out.println("Not Registered"); }
		 */}catch(Exception e) {
			System.out.println(e.getMessage());
			
	}

}
}