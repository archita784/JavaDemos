package com.coforge.oops;


	
class User{
	String name;
	String city;
	int userId;
	public User() {
	System.out.println("user details");	
	}
	public User(String name) {
		this();
		System.out.println("one param");
		this.name = name;
	}
	public User(String name, int userId) {
		
		this(name);
		System.out.println("two param");
		this.userId = userId;
	}
	public User(String name, String city, int userId) {
		this(name,userId);
		System.out.println("three param");
		this.userId = userId;
	}
	void getDetails() {
		if(name!=null)
		{
			System.out.println(name);
		}
		if(userId>0)
		{System.out.println(userId);
	}
		if(city!=null)
		{
			System.out.println(city);
		}
	}	
}
public class ConstOverload{
	public static void main(String[] args) {
		User user1=new User("Helen");
		User user2=new User("Rohan",10);
		User user3=new User("Alex","Mysore",20);
		user1.getDetails();
		user2.getDetails();
		user3.getDetails();
	}	
	}


