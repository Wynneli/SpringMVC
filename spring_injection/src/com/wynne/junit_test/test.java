package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
