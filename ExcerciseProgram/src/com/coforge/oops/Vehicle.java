package com.coforge.oops;

public class Vehicle {
	private String name;
	private int vehicleId;
	private long price;
	private double mileage;
	private boolean accessories;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}  
	public boolean isAccessories() {
		return accessories;
	}
	public void setAccessories(boolean accessories) {
		this.accessories = accessories;
	}
	
	

	
}