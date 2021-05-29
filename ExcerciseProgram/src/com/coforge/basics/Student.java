package com.coforge.basics;

public class Student {

	String studentname;
	int studentid;
	int[] marks = new int[10];

	public Student(String studentname, int studentid, int[] marks) {
		this.studentname = studentname;
		this.studentid = studentid;
		this.marks = marks;
	}

	public void getDetails() {
		System.out.println("Student name: " + studentname);
		System.out.println("Student Id: " + studentid);
	}

	int sum = 0;
	int avg = 0;

	public void getGrades(int[] marks) {
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		avg = sum / (marks.length);
		System.out.println("The sum of number : " + sum);
		System.out.println("The average of numbers: " + avg);
	}
}
