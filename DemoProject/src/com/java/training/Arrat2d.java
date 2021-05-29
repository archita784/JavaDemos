package com.java.training;

import java.util.Scanner;

public class Arrat2d {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		System.out.println("Enter no of row");
		int row = src.nextInt();
		System.out.println("Enter number of col");
		int col = src.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = src.nextInt();
			}
		}
		int sum = 0;
		for (int[] row1 : arr) {
			for (int no : row1) {
				sum = sum + no;
			}
		}
		int avg = sum / (row * col);
		src.close();
		System.out.println("The sum of all the no.s:" + sum);
		System.out.println("The average is:" + avg);
	}

}
