package com.coforge.utildemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("pop");
		list.add("100");
		System.out.println(list);
		System.out.println(list.size());

		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
		System.out.println();
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println();

		ListIterator<String> it = list.listIterator(list.size());
		while (it.hasPrevious()) {
			String name = (String) it.previous();
			System.out.println(name);
		}
	}

}
