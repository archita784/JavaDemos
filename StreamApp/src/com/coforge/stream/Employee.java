package com.coforge.stream;

public class Employee implements Comparable<Employee> {

	private String name;
	private String city;
	private int empid;

	public Employee(String name, String city, int empid) {
		super();
		this.name = name;
		this.city = city;
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", empid=" + empid + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

}
