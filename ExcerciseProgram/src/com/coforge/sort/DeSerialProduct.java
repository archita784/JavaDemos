package com.coforge.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class DeSerialProduct {
	public static void main(String[] args) {
		FileInputStream fin = null;
		ObjectInputStream os = null;
		try {
			fin = new FileInputStream("prod.ser");
			os = new ObjectInputStream(fin);
			ArrayList<Product> productlist = (ArrayList) os.readObject();
			ArrayList<Product> list = new ArrayList<>();
			for (Product prod : productlist) {
				System.out.println(prod);
			}
			System.out.println();

			for (Product prod : productlist) {
				if (prod.getCategory().equalsIgnoreCase("Electronics"))
					list.add(prod);
			}
			System.out.println();
			Collections.sort(list, (p1, p2) -> {
				return p1.getBrand().compareTo(p2.getBrand());
			});
			for (Product prodList : list) {
				System.out.println(prodList);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
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
		System.out.println();

	}
}
