package com.wynne.Entity.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wynne.Entity.Common.car1;
import com.wynne.Entity.Common.office1;

@Component
public class Teacher9 {
	@Autowired
	private car1 car;
	@Autowired
	private office1 office;
	public String toString(){
		return "car"+"\t"+car+"\n"+"office"+"\t"+office;
	}

}
