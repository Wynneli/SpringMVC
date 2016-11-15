package com.wynne.Entity;

public class Teacher {
	private String  car;
	private String office;
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String toString(){
		return "car"+car+"\n"+"office"+office;
	}

}
