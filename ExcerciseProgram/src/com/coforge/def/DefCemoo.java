package com.coforge.def;

class Employee implements Courses {

	@Override
	public void showCourses() {
		System.out.println("Employee course");

	}

}

class Student implements Courses {

	@Override
	public void showCourses() {
		System.out.println("Student course");

	}

}

class JobSeekers implements Courses {

	@Override
	public void showCourses() {
		System.out.println("job course");

	}

}

public class DefCemoo {
	public static void main(String[] args) {
		Courses courses = new Employee();
		courses.showCourses();
		courses = new Student();
		courses.showCourses();
		courses = new JobSeekers();
		courses.showCourses();

		Courses course = new Courses() {

			@Override
			public void showCourses() {
				System.out.println("cloud comp");

			}
		};
		courses.showCourses();
		courses = new Courses() {

			@Override
			public void showCourses() {
				System.out.println("basic technlo");
			}
		};

		courses.showCourses();
	}

}
