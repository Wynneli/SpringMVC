package com.wynne.java;

import com.wynne.DaoImpl.SpringDao;

//setע��
public class set_injection {
	//ע�����springdao
	private SpringDao springDao;
	//һ��Ҫд��ע��Ķ����set����
	public void setSpringDao(SpringDao springDao){
		this.springDao=springDao;
	}
	public void test_spring_Dao(){
		System.out.println("OK");
	}
}
