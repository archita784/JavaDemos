package com.coforge.exceptions;

public class TryDemo {
	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			String value = args[0];
			System.out.println(value);
			int num = Integer.parseInt(value);
			System.out.println(num);
			int total = 100 / num;
			System.out.println(total);
			int [] marks=null;
			System.out.println(marks[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter a value");
		}catch (NumberFormatException e) {
			System.out.println("please enter a no.");
		}catch(ArithmeticException e) {
			System.out.println("enter no greator then 1");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("other exception");
		}
		System.out.println("complete");
	}

}
