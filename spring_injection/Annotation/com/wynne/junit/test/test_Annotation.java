package com.wynne.junit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Annotation.Controller.controller;

public class test_Annotation {
  @Test
  public void test(){
	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
	 controller c=context.getBean("controller",controller.class);
	 c.testcontroller();
  }
}
