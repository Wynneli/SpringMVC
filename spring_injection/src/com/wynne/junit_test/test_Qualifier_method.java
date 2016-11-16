package com.wynne.junit_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wynne.Entity.Qualifier.Teacher4;

public class test_Qualifier_method {
	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher4 teacher4=(Teacher4)context.getBean("Teacher4");
        System.out.println(teacher4);
	}
}
