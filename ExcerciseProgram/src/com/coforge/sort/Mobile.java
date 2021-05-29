package com.coforge.sort;

public class Mobile implements Comparable<Mobile> {
	String name, brand;
	Double price;

	public Mobile(String name, String brand,Double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	// mob1.compareTo(mob2)
	@Override
	/*
	 * public int compareTo(Mobile o) {
	 * 
	 * return this.getBrand().compareTo(o.getBrand()); }
	 */
public int compareTo(Mobile o) {
		
		return o.getBrand().compareTo(this.getBrand());
	}

}
