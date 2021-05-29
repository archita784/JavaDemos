package com.coforge.def;

public class DefDemoo {
	public static void main(String[] args) {
		Courses courses=()->{
			System.out.println("cloud comp");
		};
		courses.showCourses();
		
		Courses course1=() -> System.out.println("Fiull Stack");
		course1.showCourses();
		Courses courses2=() ->{
			System.out.println("Basic");
			System.out.println("algo");
		};
		courses2.showCourses();
		
		Checker check= (name) -> System.out.println("Welcome");
		check.greet("priya");
		
	}

}
