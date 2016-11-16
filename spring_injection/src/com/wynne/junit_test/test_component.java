package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.component.Teacher9;



public class test_component {
	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher9 teacher9=(Teacher9)context.getBean("Teacher9");
		System.out.println(teacher9);

	}
}
