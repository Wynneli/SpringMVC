package com.wynne.Entity.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

import com.wynne.Entity.Common.*;
public class Teachers {
	@Autowired
	private car cars;
	@Autowired
	private office offices;
	public String toString(){
		return "car"+"\t"+cars+"\n"+"office"+"\t"+offices;
	}

}
