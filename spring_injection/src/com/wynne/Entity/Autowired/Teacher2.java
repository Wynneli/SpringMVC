package com.wynne.Entity.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import com.wynne.Entity.Common.*;
public class Teacher2 {
	private car car;
	private office office;
    @Autowired
	public void setCar2(car car2) {
		this.car = car2;
	}
    @Autowired
	public void setOffice2(office office2) {
		this.office= office2;
	}
    public String toString(){
		return "car"+"\t"+car+"\n"+"office"+"\t"+office;
	}
}
