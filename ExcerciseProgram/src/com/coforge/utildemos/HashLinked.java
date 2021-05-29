package com.coforge.utildemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashLinked {
	public static void main(String[] args) {
		Set<String> hash = new LinkedHashSet<>();
		hash.add("Ram");
		hash.add("John");
		hash.add("Jack");
		hash.add("Ram");
		hash.add("helen");
		// hash.add(null);

		System.out.println();

		System.out.println(hash);

		System.out.println();
		Iterator<String> i = hash.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}

	}

}
