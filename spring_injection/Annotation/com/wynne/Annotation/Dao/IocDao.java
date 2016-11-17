package com.wynne.Annotation.Dao;

import org.springframework.stereotype.Repository;

import com.wynne.Annotation.IDao.IIocDao;

@Repository("iocDao4")
public class IocDao implements IIocDao {
   public void add(){
	   System.out.println("调用了Dao");
   }
}
