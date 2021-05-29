package com.coforge.lambdaDemo;

interface StudDetails {
	double getAverage(int... marks);
}

class Student {
	String name, city;

	public void printDetails(String name, String city, StudDetails details, int... marks) {
		System.out.println(name + " " + city);
		System.out.println("marks"+details.getAverage(marks));

	}
}

class StudDetailsImpl implements StudDetails {

	@Override
	public double getAverage(int... marks) {
		int sum = 0;
		double avg = 0;
		for (int val : marks) {
			sum += val;
		}
		avg = (sum / marks.length);
		return avg;
	}
}

public class StudeMain {

	public static void main(String[] args) {
		Student sd = new Student();
		StudDetails details = new StudDetailsImpl();
		sd.printDetails("Ram", "Goa", details, 90, 85, 56);
		sd.printDetails("Ravi", "Mysore", details, 90, 77);
		sd.printDetails("Pooja", "Banglore", details, 90, 55, 76, 43);
	}

}