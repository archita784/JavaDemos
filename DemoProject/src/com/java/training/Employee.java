package com.java.training;

public class Employee {
	String name;
	int empId;
	double salary;

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "Ram";
		employee.empId = 10;
		employee.salary = 1000;
		System.out.println(employee.name + "\t" + employee.empId + "\t" + employee.salary);
		employee.name = "Rohan";
		employee.empId = 20;
		employee.salary = 2000;
		System.out.println(employee.name + "\t" + employee.empId + "\t" + employee.salary);
		Employee employee2=employee;
		System.out.println(employee.name + "\t" + employee.empId + "\t" + employee.salary);
		employee2.name="helen";
		System.out.println(employee2.name);
		System.out.println(employee.name);
		//employee=null;
		System.out.println(employee2.name);
		System.out.println(employee.name);
	}

}
