package com.coforge.utildemos;

public class Customer {
	private String customerName;
	private int customerId;
	private String City;
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", City=" + City + "]";
	}
	public Customer(String customerName, int customerId, String city) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		City = city;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	

}
