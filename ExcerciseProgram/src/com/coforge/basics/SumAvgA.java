package com.coforge.basics;

public class SumAvgA {
	public static void main(String[] args) {
		int arr[] = { 10, 24, 45, 90, 80 };
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println(sum);
		System.out.println(avg);
	}
}
