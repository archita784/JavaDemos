package com.coforge.utildemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		//Map<Integer,String> hashMap=new TreeMap<>();
		Map<Integer,String> hashMap=new HashMap<>();
		//Map<Integer,String> hashMap=new LinkedHashMap()<>();
		
		
		hashMap.put(6,"priya");
		hashMap.put(7, null);
		hashMap.put(8, "Helen");
		hashMap.put(null, "Raju");
		hashMap.put(12, "Rohan");
		
		System.out.println(hashMap);
		System.out.println(hashMap.containsKey(100));
		System.out.println(hashMap.containsValue("priya"));
		
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(100));
		System.out.println();
		Set<Integer> keys =hashMap.keySet();
		for(Integer oneKey:keys) {
			System.out.println(hashMap.get(oneKey));
		}
	}

}
