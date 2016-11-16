package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.Autowired.Teacher2;

public class testAnnotation_method {
   @Test
   public void test1(){
		  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		  Teacher2 teacher=(Teacher2)context.getBean("Teacher2");
		  System.out.println(teacher);
	  }
}
