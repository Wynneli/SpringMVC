package com.wynne.Entity.Common;

import org.springframework.stereotype.Component;

@Component
public class office1 {
	private String officeNo;
	private String size;
	
	public String toString(){
		return "officeNo:"+officeNo+"\t"+"size:"+size;
	}
}
