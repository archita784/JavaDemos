package com.coforge.oops;

class InEmployee {
	String name;
	int empId;

	void getDetails() {
		System.out.println(name + " " + empId);
	}
}

class InManager extends InEmployee {
	int salary;

	void greetMesage() {
		System.out.println("Have a great day");
		;
	}
}

public class InherDemo {
	public static void main(String[] args) {
		InEmployee emp = new InEmployee();
		emp.name = "Raju";
		emp.empId = 10;
		emp.getDetails();
		InManager man = new InManager();
		man.name = "Rohan";
		man.empId = 11;
		man.getDetails();

	}

}
