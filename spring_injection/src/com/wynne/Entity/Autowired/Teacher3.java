package com.wynne.Entity.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import com.wynne.Entity.Common.*;
public class Teacher3 {
    private car car3;
    private office office3;
    @Autowired
	public Teacher3(car car3, office office3) {
		super();
		this.car3 = car3;
		this.office3 = office3;
	}
    public String toString(){
		return "car"+"\t"+car3+"\n"+"office"+"\t"+office3;
	}
}
