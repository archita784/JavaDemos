package com.coforge.exceptions;

public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			String value = args[0];
			System.out.println(value);
			int num = Integer.parseInt(value);
			System.out.println(num);
			int total = 100 / num;
			System.out.println(total);
			int[] marks = null;
			System.out.println(marks[2]);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException
				| NullPointerException e) {

			System.out.println("please enter value greator then 0");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("other exception");
		}
		System.out.println("complete");
	}

}
