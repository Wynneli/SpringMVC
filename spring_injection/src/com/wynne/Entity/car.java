package com.wynne.Entity;

public class car {
	private String brand;
	private double  price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString(){
		return "brand:"+brand+"\t"+"price:"+price;
	}
}
