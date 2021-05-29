package com.coforge.threads;

class ChildThread extends Thread {
	public ChildThread(String name, int priority) {
		this.setName(name);
		setPriority(priority);
		System.out.println(this);
		start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			String tname = Thread.currentThread().getName();
			System.out.println("hello" + i + tname);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class ChildDemo {
	public static void main(String[] args) {
		Thread t = new ChildThread("thread1", 10);
		/*
		 * //t.start(); t.setName("thread1"); t.setPriority(10); t.start();
		 */
		Thread t1 = new ChildThread("thread2", 8);
		/*
		 * t1.setName("thread2"); t1.setPriority(10); t1.start();
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "*5=" + (i * 5));
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			t.join();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("work done");
	}

}
