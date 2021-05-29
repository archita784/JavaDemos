package com.coforge.readers;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {

		try (FileReader fr = new FileReader("D:\\javademos\\ExcerciseProgram\\Sample.txt"))

		{
			int c = fr.read();
			do {
				System.out.print((char) c);

				c = fr.read();

			} while (c != -1);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("completed");
	}

}
