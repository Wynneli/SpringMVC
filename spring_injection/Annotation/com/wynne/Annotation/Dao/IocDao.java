package com.wynne.Annotation.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class IocDao {
   public void add(){
	   System.out.println("调用了Dao");
   }
}
