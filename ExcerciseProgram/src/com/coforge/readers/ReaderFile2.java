package com.coforge.readers;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderFile2 {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		try (FileWriter fw = new FileWriter("D:\\javademos\\ExcerciseProgram\\Sample.txt", true)) {
			System.out.println("enter data");
			char c;

			c = (char) br.read();
			do {
				System.out.print(c);
				fw.write(c);
				c = (char) br.read();

			} while (c != 'q');

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
		System.out.println("completed");
	}

}
