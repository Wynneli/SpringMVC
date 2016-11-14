package com.wynne.DaoImpl;

import com.wynne.IDao.springDao;

public class SpringDao implements springDao {
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
