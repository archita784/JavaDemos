package com.coforge.sort;

import java.io.Serializable;

public class Product implements Serializable,Comparable<Product> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	String name;
	
	String category;
	int price;
	String brand;
	public Product(String name, String category, int price, String brand) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + ", brand=" + brand + "]";
	}
	@Override
	public int compareTo(Product o) {
		return o.getBrand().compareTo(this.getBrand());
	}
	

}
