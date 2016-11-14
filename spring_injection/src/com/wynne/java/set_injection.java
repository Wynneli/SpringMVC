package com.wynne.java;

import com.wynne.DaoImpl.SpringDao;

//set注入
public class set_injection {
	//注入对象springdao
	private SpringDao springDao;
	//一定要写被注入的对象的set方法
	public void setSpringDao(SpringDao springDao){
		this.springDao=springDao;
	}
	public void test_spring_Dao(){
		System.out.println("OK");
	}
}
