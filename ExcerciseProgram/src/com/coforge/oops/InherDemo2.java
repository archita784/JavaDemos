package com.coforge.oops;

class InEmployeeD {

	String name;
	int empId;

	public InEmployeeD(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	void getDetails() {
		System.out.println(name + " " + empId);
	}
}

class InManagerD extends InEmployeeD {
	int salary;

	public InManagerD(String name, int empId, int salary) {
		super(name, empId);
		this.salary = salary;
	}

	void greetMesage() {
		System.out.println("Have a great day");

	}
}

public class InherDemo2 {
	public static void main(String[] args) {
		InEmployeeD emp = new InEmployeeD("Raju", 11);
		emp.getDetails();

		InManagerD man = new InManagerD("Rohan", 12, 9000);
		man.getDetails();
		man.greetMesage();

	}

}
