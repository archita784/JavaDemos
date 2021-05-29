package com.coforge.threads;

class Trainer {
	String answerQuery(String name, String question) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " question " + question);
		return name;

	}
}

class Student implements Runnable {
	String name;
	String question;
	Trainer trainer;

	public Student(String name, String question, Trainer trainer) {
		super();
		this.name = name;
		this.question = question;
		this.trainer = trainer;
		Thread t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		synchronized (trainer) {
			trainer.answerQuery(name, question);
		}
	}

}

public class QueryMain {
	public static void main(String[] args) {
		System.out.println("hello");
		Trainer trainer = new Trainer();
		Student std1 = new Student("ram", "course?", trainer);
		Student std2 = new Student("raju", "college?", trainer);
		Student std3 = new Student("rohan", "year?", trainer);
	}

}
