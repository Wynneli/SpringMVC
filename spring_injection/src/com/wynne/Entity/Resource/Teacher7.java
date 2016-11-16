package com.wynne.Entity.Resource;

import javax.annotation.Resource;
import com.wynne.Entity.Common.car;
import com.wynne.Entity.Common.office;

/*
@Resource
@Resource 的作用相当于 @Autowired，只不过 @Autowired 按 byType 自动注入，面@Resource 
默认按 byName 自动注入罢了。@Resource 有两个属性是比较重要的，分别是 name 和 type，Spring 
将@Resource 注释的 name 属性解析为 Bean 的名字，而 type 属性则解析为 Bean 的类型。所以如果使用 
name 属性，则使用 byName 的自动注入策略，而使用 type 属性时则使用 byType 自动注入策略。
如果既不指定 name 也不指定 type 属性，这时将通过反射机制使用 byName 自动注入策略
*/
public class Teacher7 {
	//自动注入类型为car的bean,属性必须是car7
   @Resource
   private car car7;
   
   //自动注入bean名称为office的Bean，name必须是office7
   @Resource(name="office7")
   private office office;
   public String toString(){
		return "car"+"\t"+car7+"\n"+"office"+"\t"+office;
	}
}
