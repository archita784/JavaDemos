package com.coforge.readers;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderFile {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		FileWriter fw = null;
		try {
			fw = new FileWriter("sample.txt",true);

			System.out.println("enter data");
			char c;

			c = (char) br.read();
			do {
				System.out.print(c);
				fw.write(c);
				c = (char) br.read();
				
				
			} while (c != 'q');

		} catch (IOException e) {
			System.out.println (e.getMessage());
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("completed");
	}

}
