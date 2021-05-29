package com.coforge.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareDemo {
	public static void main(String[] args) {
		Mobile mob = new Mobile("A123", "Samsung", 93272.9);
		Mobile mob1 = new Mobile("S123", "Vivo", 93272.9);
		Mobile mob2 = new Mobile("iphone", "Apple", 93272.9);
		ArrayList<Mobile> mobilelist = new ArrayList<>();
		mobilelist.add(mob);
		mobilelist.add(mob1);
		mobilelist.add(mob2);
		for (Mobile mobile : mobilelist) {
			System.out.println(mobile);
		}
		System.out.println();
		Collections.sort(mobilelist);
		for (Mobile mobile : mobilelist) {
			System.out.println(mobile);
		}
		/*
		 * System.out.println(); Comparator<Mobile> c =new NameSort();
		 * Collections.sort(mobilelist,c); for(Mobile mobile:mobilelist){
		 * System.out.println(mobile); } System.out.println();
		 * 
		 * Collections.sort(mobilelist,new PriceSort()); for(Mobile mobile:mobilelist){
		 * System.out.println(mobile); }
		 */
		Comparator<Mobile> ns=(Mobile o1,Mobile o2)->{
			return (o1.getName().compareTo(o2.getName()));
		};
		
		Comparator<Mobile> bs=(Mobile o1,Mobile o2)->{
			return (o1.getBrand().compareTo(o2.getBrand()));
		};
		Comparator<Mobile> ps=(Mobile o1,Mobile o2)->{
			return (o1.getPrice().compareTo(o2.getPrice()));
		};
	}
}
