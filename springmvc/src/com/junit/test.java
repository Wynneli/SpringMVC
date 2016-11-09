package com.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Login;

public class test {
   @Test
   public void test1(){
	   ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
	   Login login=(Login)context.getBean("login");
	   login.test();
	   
   }
}
