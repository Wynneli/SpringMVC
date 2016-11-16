package com.wynne.Entity.Qualifier;
//使用@Qualifier注解进行注入

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wynne.Entity.Common.car;
import com.wynne.Entity.Common.office;
/*
 @Qualifier("office") 中的 office 是 Bean 的名称，所以 @Autowired 和@Qualifier 结合使用时，
 自动注入的策略就从 byType 转变成 byName 了@Autowired 可以对成员变量、方法以及构造函数进行注释，
 而@Qualifier 的标注对象是成员变量、方法入参、构造函数入参。正是由于注释对象的不同，所以 Spring 
 不将 @Autowired 和@Qualifier 统一成一个注释类
 */
public class Teacher4 {
	private car car;
	private office office;
	/* 
	   可以试试改下面的参数（@Qualifier（"office4"））中传入的参数,改成office或者office5，
	   
	   都不会有任何影响，只要更改后面的setOffice(@Qualifier("office")office office4)中
	 
	 office4的值，就会得到与预想不太一样的结果，因为是使用xml中配置的值来赋给这个对象的属性值
	 
	 所以xml中配置信息想注入到该对象中就要和下面set中对象的属性值一致
	 
	 注意：如果使用的是@AUtowired对成员变量进行注解的时候就要写和xml中id中配置的名字一样了，否则
	 
	 没有办法找到注入的信息，详细可以去com.wynne.Entity.Autowire.Teachers或者
	 
	 com.wynne.Entity.Qualifier.Teacher5中更改试试,反正是成员变量的都不行
	 */
	@Autowired
	public void setOffice(@Qualifier("office")office office4){
		this.office=office4;
	}
	@Autowired
	public void setCar(@Qualifier("car")car car4){
		this.car=car4;
	}
	public String toString(){
		return "car"+"\t"+car+"\n"+"office"+"\t"+office;
	}

}
