package com.wynne.Entity.Autowire.variable;

import org.springframework.beans.factory.annotation.Autowired;

public class Teachers {
	@Autowired
	private cars car;
	@Autowired
	private offices office;

	public cars getCar() {
		return car;
	}

	

	public offices getOffice() {
		return office;
	}

	

	public String toString(){
		return "car"+"\t"+car+"\n"+"office"+"\t"+office;
	}

}
