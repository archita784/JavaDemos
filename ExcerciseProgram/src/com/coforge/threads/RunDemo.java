package com.coforge.threads;

/*class RunThread implements Runnable {

	@Override
	public void run() {
		Bank bank = new Bank();
		double interest = bank.calculateInterest(8000);
		System.out.println(interest);
	}

}*/
public class RunDemo {
	public static void main(String[] args) {
		//Bank bank = new Bank();
		//double interest = bank.calculateInterest(9000);
		//System.out.println(interest);
		//Runnable rt = new RunThread();
		
		//bank.calculateInterest(9000);
		
		Runnable rt = () -> {
			Bank bank = new Bank();
			 System.out.println("interest: " + bank.calculateInterest("ram", 9000));
			};
			
		Thread t = new Thread(rt, "Thread-1");
		t.start();
		Thread t1 = new Thread(rt, "Thread-2");
		t1.start();
	}

}
