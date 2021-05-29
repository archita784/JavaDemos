package com.coforge.basics;

public class SmallInA {
	public static void main(String[] args) {

		int arr[] = { 10, 24, 45, 90, 80 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
		System.out.println(min);
	}

}
