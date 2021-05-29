package com.coforge.threads;

public class MainThread {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		
		System.out.println(t.getPriority());
		t.setName("poppy");
		System.out.println(t);
		int x=10/0;
		System.out.println(x);
	}

}
