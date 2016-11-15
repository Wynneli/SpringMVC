package com.wynne.java;

import com.wynne.DaoImpl.SpringDao;

public class Factory_injection {
	private SpringDao springDao1;
	public void springdao_ok(){
		System.out.println("finish!");
	}
	public void setSpringDao(SpringDao springDao){
		this.springDao1=springDao;
		System.out.println(springDao.getName());
	}
}
