package com.wynne.Entity.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import com.wynne.Entity.Common.*;
public class Teacher3 {
    private car car;
    private office office;
    @Autowired
	public Teacher3(car car3, office office3) {
		super();
		this.car = car3;
		this.office = office3;
	}
    public String toString(){
		return "car"+"\t"+car+"\n"+"office"+"\t"+office;
	}
}
