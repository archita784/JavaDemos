package com.coforge.lambdaDemo;

public class Lambda {
	public static void main(String[] args) {
		Greet gt=(String message)->{
			System.out.println("have a great day"+message);
		};
		Greet gt1=(String message)->{
			System.out.println("welcome to thread"+message);
		};
		Greet gt2=(String message)->{
			System.out.println("goodbye"+message);
		};
		gt.greetmessage("Archita");
		gt1.greetmessage("Archita");
		gt2.greetmessage("Archita");
	}

}
