package com.coforge.interfac;

public class InfarDemo {
	public static void main(String[] args) {
		Gadgets tv=new TV("GFDS",23);
		tv.getDetails();
		tv.getdiscountedPrice(23456);
		tv.showAccessories();
		Gadgets mb=new Mobile("HGFds",54 );
		mb.getDetails();
		mb.getdiscountedPrice(543);
		mb.showAccessories();
		
		
	}

}
