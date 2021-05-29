package com.coforge.readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderDemo2 {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("enter data");

		try {
			String c = br.readLine();
			do {
				System.out.println(c);
				c = br.readLine();
			} while (!c.equals("stop"));
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("completed");
	}

}
