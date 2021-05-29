package com.coforge.basics;

public class RverseArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int temp;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		System.out.println("Reversed array is: \n");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

}
