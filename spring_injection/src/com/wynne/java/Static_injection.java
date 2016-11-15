package com.wynne.java;



import com.wynne.DaoImpl.SpringDao;

public class Static_injection {
	//注入对象  
	private SpringDao staticspringDao;
	public void staticSpringDaotest(){
		System.out.println("StaticSpringDao is Ok!");
	}
	//注入对象的set方法  
	public void setStaticSpringDao(SpringDao springDao){
		this.staticspringDao=springDao;
		
	}
}
