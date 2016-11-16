package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.Autowired.Teachers;

public class testAnnotation_variable {
   @Test
   public void test(){
		  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		  Teachers teacher=(Teachers)context.getBean("Teachers");
		  System.out.println(teacher);
	  }
   
}
