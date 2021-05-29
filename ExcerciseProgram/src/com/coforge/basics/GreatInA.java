package com.coforge.basics;

public class GreatInA {
	public static void main(String[] args) {

		int arr[] = { 10, 24, 45, 90, 80 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		System.out.println(max);
	}

}
