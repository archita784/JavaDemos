package com.coforge.oops;

public class StaticStud {

	static String trainer;
	static String company = "coforge";
	String name;
	String laptopModel;
	long mobile;

	static {

		System.out.println("Welcome");

	}
	static {
		trainer = "Priya";
		System.out.println("Static block -1");
	}

	public StaticStud(String name, String laptopModel, long mobile) {
		super();
		this.name = name;
		this.laptopModel = laptopModel;
		this.mobile = mobile;
	}

	static void greet() {
		System.out.println("Great Day");
		System.out.println(trainer + " From " + company);
	}

	void show() {
		System.out.println(name + " uses: " + laptopModel + " contact no: " + mobile);
		System.out.println(trainer + " " + company);
	}

	public static void main(String[] args) {
		System.out.println("Main");
		System.out.println(trainer);
		greet();
		StaticStud st = new StaticStud("Ram", "FDS", 745678);
		st.show();
	}

}
