package com.coforge.oops;
 class Shape {
	void calcArea(int x) {
		System.out.println("SQ= " + (x * x));
	}

	double calcArea(double x) {
		return Math.PI * x * x;
	}

	int calcArea(int length, int breadth) {
		return (length * breadth);
	}

	double calcArea(int length, double height) {
		return (0.5 * length * height);
	}
}

	 public  class OverloadDemo{
		 public static void main(String[] args) {
			System.out.println("main");
			Shape shape=new Shape();
		    shape.calcArea(10);
			
		System.out.println(	shape.calcArea(30.5));
			int rect=shape.calcArea(10, 30);
			System.out.println("rect"+rect);
			double tri=shape.calcArea(20, 30.5);
			System.out.println("triangle"+tri);
		
		}
	

	 }


