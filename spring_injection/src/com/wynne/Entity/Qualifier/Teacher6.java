package com.wynne.Entity.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wynne.Entity.Common.car;
import com.wynne.Entity.Common.office;

public class Teacher6 {
	private office office;
	private car car;
	@Autowired
	public Teacher6(@Qualifier("office")office office6,@Qualifier("car")car car6) {
		this.office = office6;
		this.car = car6;
	}
	public String toString(){
		return "car"+"\t"+car+"\n"+"office"+"\t"+office;
	}

}
