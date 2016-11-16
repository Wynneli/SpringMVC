package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.Resource.Teacher7;

public class test_resource {
	 @Test
	  public void test(){
		  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		  Teacher7 teacher7=(Teacher7)context.getBean("Teacher7");
		  System.out.println(teacher7);
	  }
}
