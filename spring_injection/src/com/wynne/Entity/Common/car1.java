package com.wynne.Entity.Common;

import org.springframework.stereotype.Component;

@Component
public class car1 {
	private String brand;
	private double  price;
	
	public String toString(){
		return "brand:"+brand+"\t"+"price:"+price;
	}
}
