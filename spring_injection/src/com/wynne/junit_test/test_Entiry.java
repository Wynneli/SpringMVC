package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.Autowired.Teacher;


public class test_Entiry {
  @Test
  public void test(){
	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	  Teacher teacher=(Teacher)context.getBean("Teacher");
	  System.out.println(teacher);
  }
  
  
}
