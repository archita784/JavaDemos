package com.java.training;

public class Greatestof3t {
	public static void main(String[] args) {

		    int a=8;
		    int b=10; 
		    int c=2;
		    int biggest=0 ;  
		 
		    biggest = a > b ? (a > c ? a : c) : (b > c ? b : c) ;
		 
		    System.out.println("greatest no="+ biggest);
		
	}

}
