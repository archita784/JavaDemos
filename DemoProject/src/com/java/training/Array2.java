package com.java.training;

public class Array2 {
	public static void main(String[] args) {
		int [] marks=new int[4];
		System.out.println(marks[1]);
		marks[0]=90;
		marks[1]=76;
		marks[2]=89;
		marks[3]=99;
		int sum=0;
		for(int num:marks)
		{sum+=num;
			
		}
		System.out.println(sum);

	}
}
