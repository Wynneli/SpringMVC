package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.Qualifier.Teacher5;

public class test_Qualifier_variable {
  @Test
  public void test(){
	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	  Teacher5 teacher5=(Teacher5)context.getBean("Teacher5");
	  System.out.println(teacher5);
  }
}
