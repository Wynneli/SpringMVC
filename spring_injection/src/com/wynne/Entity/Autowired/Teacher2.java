package com.wynne.Entity.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import com.wynne.Entity.Common.*;
public class Teacher2 {
	private car car2;
	private office office2;
    @Autowired
	public void setCar2(car car2) {
		this.car2 = car2;
	}
    @Autowired
	public void setOffice2(office office2) {
		this.office2 = office2;
	}
    public String toString(){
		return "car"+"\t"+car2+"\n"+"office"+"\t"+office2;
	}
}
