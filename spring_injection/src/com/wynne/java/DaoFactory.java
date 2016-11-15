package com.wynne.java;

import com.wynne.DaoImpl.SpringDao;

public class DaoFactory {
     //实例工厂
	public SpringDao getSpringDaoImpl(){
		return new SpringDao();
	}
}
