package com.coforge.basics;

public class SecondBig {

	public static void main(String[] args) {

		int arr[] = { 10, 24, 45, 90, 80 };
		int max = arr[0];
		int second_max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)

			{
				second_max = max;
				max = arr[i];
			} else if (arr[i] > second_max && arr[i] != max) {
				second_max = arr[i];
			}
		}
		System.out.println("The greatest element is " + max + " and second greatest" + " element is " + second_max);
	}

}
