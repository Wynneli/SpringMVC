package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.Autowired.Teacher3;

public class testAnnotation_constructor_method {
	 @Test
	   public void test(){
			  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			  Teacher3 teacher=(Teacher3)context.getBean("Teacher3");
			  System.out.println(teacher);
		  }
}
