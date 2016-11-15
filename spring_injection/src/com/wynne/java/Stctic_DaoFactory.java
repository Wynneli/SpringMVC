package com.wynne.java;

import com.wynne.DaoImpl.SpringDao;

public class Stctic_DaoFactory {
	//静态工厂
     public static final SpringDao getStaticSpringDaoImpl(){
    	 return new SpringDao();
     }
}
