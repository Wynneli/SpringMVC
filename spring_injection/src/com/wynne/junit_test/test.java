package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.DaoImpl.SpringDao;
import com.wynne.java.Factory_injection;
import com.wynne.java.Static_injection;
import com.wynne.java.constructor_injection;
import com.wynne.java.set_injection;

public class test {
   @Test
   public void test(){
	   ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
	   set_injection s=(set_injection)context.getBean("set_injection");
	   s.test_spring_Dao();
   }
   @Test
   public void test1(){
	   ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
	   constructor_injection s=(constructor_injection)context.getBean("constructor_injection");
	   s.save();
   }
   @Test
   public void test2(){
	   SpringDao springDao=new SpringDao();
	   springDao.setName("jack");
	   ApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
	   Factory_injection s=(Factory_injection)context.getBean("Factory_injection");
       s.springdao_ok();
       s.setSpringDao(springDao);
   }
   @Test
   public void test3(){
	   ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
	   Static_injection s=(Static_injection)context.getBean("Static_injection");
	   s.staticSpringDaotest();
   }
}
