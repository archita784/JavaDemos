package com.coforge.oops;

import static com.coforge.oops.Trial.*;//to use trial class variables in line 19 and 20
import static java.lang.Integer.parseInt;// to import integer of line 15 to right it as line 16



public class StaticDemo2 {
	static {
		System.out.println("Static block one");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		System.out.println("Product: " + (Trial.x * Trial.y));
		//int num = Integer.parseInt("100");
		int num=parseInt("100");
		System.out.println(num);
		int sum=x+y;
		System.out.println(sum);
		Trial.greet();
	}

}
