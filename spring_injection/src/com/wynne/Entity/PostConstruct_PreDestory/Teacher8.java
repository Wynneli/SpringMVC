package com.wynne.Entity.PostConstruct_PreDestory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import com.wynne.Entity.Common.car;
import com.wynne.Entity.Common.office;


// @PostConstruct 注释的方法将在类实例化后调用，而标注了 @PreDestroy 的方法将在类销毁之前调用
public class Teacher8 {
  @Resource(name="car8")
  private car car;
  @Resource(name="office8")
  private office office;
  public String toString(){
		return "car"+"\t"+car+"\n"+"office"+"\t"+office;
	}
  @PostConstruct
  public void postconstruct(){
	  System.out.println("postconstruct");
  }
  @PreDestroy
  public void predestory(){
	  System.out.println("predestory");
  }
}
