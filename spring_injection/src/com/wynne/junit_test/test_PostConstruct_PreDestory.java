package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.PostConstruct_PreDestory.Teacher8;



public class test_PostConstruct_PreDestory {
	@Test
	public void test(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher8 teacher8=(Teacher8)context.getBean("Teacher8");
		System.out.println(teacher8);
		context.destroy();
	}
}
