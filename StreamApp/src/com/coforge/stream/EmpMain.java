package com.coforge.stream;

import java.util.Arrays;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("jack", "delhi", 1);
		Employee emp2 = new Employee("rohan ", "mumbai", 2);

		List<Employee> empList = Arrays.asList(

				new Employee("ram", "pune", 3), new Employee("jay", "bangalore", 4), new Employee("helen", "delhi", 5),
				emp1, emp2);
		empList.forEach(emp -> System.out.println(emp.getName()));
		System.out.println();
		empList.stream().filter(emp -> emp.getCity().equals("delhi")).forEach(System.out::println);

		System.out.println("using comparator in sorted function");
		empList.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.forEach(emp -> System.out.println(emp));

		System.out.println("using comparable");
		empList.stream().sorted().forEach(emp -> System.out.println(emp));

		System.out.println("get one employee by id");
		Employee employ = empList.stream().filter(emp -> emp.getEmpid() == 3).findFirst()
				.orElseThrow(() -> new RuntimeException());
		System.out.println(employ);

		System.out.println("print all employees by name");
		String empName = empList.stream().map(emp -> emp.getName()).sorted().filter(s -> s.startsWith("j")).findFirst()
				.orElse("not in first place");
		System.out.println(empName);

	}
}