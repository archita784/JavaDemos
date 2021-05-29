package com.coforge.basics;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		System.out.println("Enter no to reverse");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reversed = 0;

		while (num != 0) {

			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		System.out.println("Reversed Number: " + reversed);
	}
}
