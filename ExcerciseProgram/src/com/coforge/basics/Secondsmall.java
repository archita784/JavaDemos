package com.coforge.basics;

public class Secondsmall {
	public static void main(String[] args) {

		int arr[] = { 10, 24, 45, 90, 80 };
		int min = arr[0];
		int second_min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)

			{
				second_min = min;
				min = arr[i];
			} else if (arr[i] < second_min && arr[i] != min) {
				second_min = arr[i];
			}
		}
		System.out.println("The smallest element is " + min + " and second Smallest" + " element is " + second_min);
	}

}
