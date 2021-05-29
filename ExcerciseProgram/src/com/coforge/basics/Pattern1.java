package com.coforge.basics;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {

		System.out.println("Input number of rows : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i);
			System.out.println();
		}
	}

}
