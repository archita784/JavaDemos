package com.coforge.utildemos;

import java.util.ArrayList;
import java.util.Iterator;

public class CusDemo {
	public static void main(String[] args) {
		Customer cus1=new Customer("ram", 10, "ooty");
		Customer cus2=new Customer("rohan", 11, "banglore");
		Customer cus3=new Customer("bhavna", 12, "mysore");
		Customer cus4=new Customer("helen", 13, "delhi");
		Customer cus5=new Customer("tom", 14, "banglore");
		ArrayList<Customer> list = new ArrayList<>();
		list.add(cus1);
		list.add(cus2);
		list.add(cus3);
		list.add(cus4);
		list.add(cus5);
		
		System.out.println(list);
		

		Iterator<Customer> i = list.iterator();
		while (i.hasNext()) {
			Customer customer = i.next();
			System.out.println(customer);
		}
		System.out.println();
		//ArrayList<Customer> customerCity = new ArrayList<>();
		//String city="banglore";
		for (Customer customer : list) {
			if (customer.getCity().equals("banglore"))
			System.out.println(customer);
		}
		System.out.println();
	}
}
