package com.coforge.threads;

class ChildThreadd extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			String tname = Thread.currentThread().getName();
			System.out.println(tname + i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ChildDemoo {
	public static void main(String[] args) {
		Thread t = new Thread();
		t.setName("child");
		t.setDaemon(true);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
