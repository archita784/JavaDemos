package com.coforge.sort;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.coforge.sort.Product;

public class SerialProduct {
	public static void main(String[] args) {

		Product prod1 = new Product("Refrigerator", "Electronics", 15000, "LG");
		Product prod2 = new Product("Television", "Electronics", 11000, "Samsung");
		Product prod3 = new Product("Table", "Furniture", 5000, "Godrej");
		Product prod4 = new Product("Novel", "Stationary", 500, "Vimal Publications");
		Product prod5 = new Product("Dress", "Garments", 3000, "FBB");
		ArrayList<Product> list = new ArrayList<>();
		list.add(prod1);
		list.add(prod2);
		list.add(prod3);
		list.add(prod4);
		list.add(prod5);
		System.out.println(prod1);
		System.out.println(prod2);
		System.out.println(prod3);
		System.out.println(prod4);
		System.out.println(prod5);
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		try {
			fs = new FileOutputStream("prod.ser");
			os = new ObjectOutputStream(fs);
			os.writeObject(prod1);
			os.writeObject(prod2);
			os.writeObject(prod3);
			os.writeObject(prod4);
			os.writeObject(prod5);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fs != null || os != null) {
				try {
					fs.close();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}
	}
}
