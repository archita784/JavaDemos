package com.coforge.basics;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		int i;
		int space;
		int k = 0;
		System.out.println("Enter no of rows");

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (i = rows; i >= 1; --i, k = 0) {
			for (space = 1; space <= rows - i; ++space) {
				System.out.println("  ");
			}
			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}

			System.out.println();
		}

	}

}
