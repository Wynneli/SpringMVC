package com.wynne.DaoImpl;

import com.wynne.IDao.IUser;

public class User implements IUser {
	private String name;
    public void set(String name){
    	this.name=name;
    }
}
