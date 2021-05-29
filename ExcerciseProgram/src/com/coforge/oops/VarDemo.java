package com.coforge.oops;

public class VarDemo {
	public static void main(String[] args) {
		VarDemo demo=new VarDemo();
		demo.calSum("Ram");
		demo.calSum("Ram",90,80);
		demo.calSum("Ram",90,80,70,70,10,20,30);
	}
	public void calSum(String name,int...marks)
	{
		System.out.println("main");
		int sum=0;
		for(int num:marks)
			sum+=num;
		System.out.println("SUM "+sum);
		
	}
	public void calsum(String name) {
		System.out.println("Have a great day");
	}

}
