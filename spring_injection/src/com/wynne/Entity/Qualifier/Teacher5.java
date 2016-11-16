package com.wynne.Entity.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wynne.Entity.Common.car;
import com.wynne.Entity.Common.office;

public class Teacher5 {
   @Autowired
   @Qualifier("car")
   private car car5;
   @Autowired
   @Qualifier("office")
   private office office5;
   public String toString(){
		return "car"+"\t"+car5+"\n"+"office"+"\t"+office5;
	}
}
