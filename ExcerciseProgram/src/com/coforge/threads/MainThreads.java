package com.coforge.threads;

public class MainThreads {

	//private static final int 5 = 0;

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		for (int i = 0; i < 10; i++) {

			System.out.println(i + "+ 5= " + (i+5));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
