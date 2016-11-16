package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.Teacher;
import com.wynne.Entity.Autowire.variable.Teachers;

public class testAnnotation {
  @Test
  public void test(){
	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	  Teacher teacher=(Teacher)context.getBean("Teacher");
	  System.out.println(teacher);
  }
  public void test1(){
	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
	  Teachers teacher=(Teachers)context.getBean("Teachers");
	  System.out.println(teacher);
  }
}
