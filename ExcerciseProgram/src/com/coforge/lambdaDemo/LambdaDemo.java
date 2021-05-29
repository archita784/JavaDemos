package com.coforge.lambdaDemo;

public class LambdaDemo {
	public static void main(String[] args) {
		Calculator sum = (x, y) -> {
			System.out.println("sum" + x + y);
		};
		sum.calculate(10, 20);

		Calculator diff = (x, y) -> {
			System.out.println("diff" +( y - x));
		};
		diff.calculate(10, 20);

		Calculator product = (x, y) -> {

			System.out.println("Product" + x * y);
		};
		product.calculate(20, 10);

		Calculator division = (x, y) -> {

			System.out.println("division" + x / y);
		};
		division.calculate(20, 10);
	}

}
