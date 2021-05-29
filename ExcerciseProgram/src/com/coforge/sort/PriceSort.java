package com.coforge.sort;

import java.util.Comparator;

public class PriceSort implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		
		return o1.getPrice().compareTo(o2.getPrice());
	}

}
