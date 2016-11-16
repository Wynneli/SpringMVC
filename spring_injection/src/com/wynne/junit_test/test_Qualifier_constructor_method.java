package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.Qualifier.Teacher6;

public class test_Qualifier_constructor_method {
	 @Test
	  public void test(){
		  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		  Teacher6 teacher6=(Teacher6)context.getBean("Teacher6");
		  System.out.println(teacher6);
	  }
}
