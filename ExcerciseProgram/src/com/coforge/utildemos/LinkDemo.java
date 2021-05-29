package com.coforge.utildemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkDemo {
	public static void main(String[] args) {
		Set<String> hash = new HashSet<>();
		hash.add("Ram");
		hash.add("John");
		hash.add("Jack");
		hash.add("Ram");
		hash.add("helen");
		hash.add(null);

		System.out.println();

		System.out.println(hash);

		System.out.println("Ram".hashCode());
		System.out.println("John".hashCode());
		System.out.println("Jack".hashCode());
		System.out.println("Helen".hashCode());
		System.out.println(hash.size());
		System.out.println();
		Iterator<String> i = hash.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}

	}

}
