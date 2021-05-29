package com.java.training;

public class Array3 {
	public static void main(String[] args) {
		int [][] marks=new int[2][2];
		System.out.println(marks[1][1]);
		marks[0][0]=90;
		marks[0][1]=76;
		marks[1][0]=89;
		marks[1][1]=99;
		for (int i=0;i<marks.length;i++)
			for(int j=0;j<2;j++)
		{
			System.out.println(marks[i][j]);
		}
		for(int[] row:marks)
			for(int val:row)
		
			System.out.println(val);
		
		

	}

}
