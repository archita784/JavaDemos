package com.coforge.readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderDemo {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("enter data");
		char c;
		try {
			c = (char) br.read();
			do {
				System.out.print(c);
				c = (char) br.read();
			} while (c != 'q');
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("completed");
	}

}
