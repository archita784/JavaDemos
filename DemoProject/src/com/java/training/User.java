
package com.java.training;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter count of no.s");
		int count = sc.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;

		for (int no : arr) {
			sum += no;
		}
		int avg = sum / count;
		System.out.println(sum);
		System.out.println(avg);

	}

}
