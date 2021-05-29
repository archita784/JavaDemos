package com.java.training;
import java.util.Scanner;
public class Scanner2 {
	public static void main(String[] args) {
		System.out.println("enter the details");
		Scanner sc =new Scanner(System.in);
		String name=sc.next();
		System.out.println("name="+" " + name);
		int id=sc.nextInt();
		System.out.println("id ="+" " + id);
		double salary=sc.nextDouble();
		System.out.println("Salary ="+" " + salary);
	}

	
}
