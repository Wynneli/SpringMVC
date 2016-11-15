package com.wynne.DaoImpl;

import com.wynne.IDao.IspringDao;

public class SpringDao implements IspringDao {
	private String name;
	public void test(String name){
		System.out.println("set_injection successsful!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
   
}
