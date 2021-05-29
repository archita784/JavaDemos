package com.java.training;

import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		System.out.println("enter the details");
		Scanner sc =new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("name="+" " + name);
		int id=sc.nextInt();
		System.out.println("id ="+" " + id);
		sc.nextLine();
		String city=sc.nextLine();
		System.out.println("city="+" "+city);
		double salary=sc.nextDouble();
		System.out.println("Salary ="+" " + salary);
		System.out.println("completed");
		sc.close();
	}

}
