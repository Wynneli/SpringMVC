package com.wynne.Entity;

public class Teacher {
	private car car;
	private office office;

	public car getCar() {
		return car;
	}

	public void setCar(car car) {
		this.car = car;
	}

	public office getOffice() {
		return office;
	}

	public void setOffice(office office) {
		this.office = office;
	}

	public String toString(){
		return "car"+"\t"+car+"\n"+"office"+"\t"+office;
	}

}
