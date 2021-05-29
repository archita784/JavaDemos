package com.coforge.inheritance;

import java.util.Scanner;

class InEmployee {

	String name;
	int empId;

	public InEmployee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	void getDetails() {
		System.out.println(name + " " + empId);
	}

	void calcBonus(int bonus) {
		System.out.println(bonus);
	}
}

class InManager extends InEmployee {
	int salary;

	public InManager(String name, int empId, int salary) {
		super(name, empId);
		this.salary = salary;
	}

	void greetMesage() {
		System.out.println("Have a great day");

	}

	@Override
	void calcBonus(int bonus) {
		System.out.println(bonus);
	}

}

class InDeveloper extends InEmployee {
	String[] hobbies;

	public InDeveloper(String name, int empId, String[] hobbies) {
		super(name, empId);
		this.hobbies = hobbies;
	}

	@Override
	void calcBonus(int bonus) {

		System.out.println(bonus);

	}

	void showHobby() {
		for (String hobby : hobbies)
			System.out.println(hobby);
	}

}

public class InherDemo {
	public static void main(String[] args) {
		System.out.println("enter m or d");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();

		InEmployee emp = null;
		if (choice.equals("m")) {
			emp = new InManager("Ram", 10, 270000);
			emp.calcBonus(1000);
			emp.getDetails();
			InManager man = (InManager) emp;
			man.greetMesage();

		} else if (choice.equals("d")) {
			emp = new InDeveloper("Rohan", 9, new String[] { "sports", "music" });
			emp.calcBonus(2000);
			emp.getDetails();
			InDeveloper dev = (InDeveloper) emp;
			dev.showHobby();
		} else {
			System.out.println("wrong choice");
		}

	}
}
