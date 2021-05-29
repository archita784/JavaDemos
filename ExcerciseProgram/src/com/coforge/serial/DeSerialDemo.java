package com.coforge.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		ObjectInputStream os = null;
		try {
			fin = new FileInputStream("stud.ser");

			os = new ObjectInputStream(fin);
			Student st = (Student) os.readObject();
			System.out.println(st);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fin != null || os != null) {
				try {
					fin.close();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
