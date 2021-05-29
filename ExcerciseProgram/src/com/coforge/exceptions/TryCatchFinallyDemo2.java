package com.coforge.exceptions;

public class TryCatchFinallyDemo2 {

	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			String value = args[0];
			System.out.println(value);
			int num = Integer.parseInt(value);
			System.out.println(num);
			int total = 100 / num;
			System.out.println(total);

		} /*
			 * catch (Exception e) { e.printStackTrace();
			 * System.out.println("other exception"); }
			 */finally {
			System.out.println(("Finally block"));
		}
		System.out.println("complete");
	}

}
