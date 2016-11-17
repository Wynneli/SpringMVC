package com.wynne.Annotation.Dao;

import org.springframework.stereotype.Repository;

import com.wynne.Annotation.IDao.IIocDao;
/*
 *1. 当使用这种方式进行注入的时候（这个时候被注入的名称就是iocDao2,即注入的就是class类名称，
 * 只是首个字母变成小写的）。本次写了两个实现了（IocDao和IocDao2，按照Service中的注入的bean
 * ，private IIocDao iocDao,所以在执行的时候就会按照IocDao中注入的参数进行执行，当把注入
 * 的参数换成 private IIocDao IocDaox时，会报错“org.springframework.beans.factory.
 * NoUniqueBeanDefinitionException: No qualifying bean of type [com.ulewo.ioc.IIocDao] 
 * is defined: expected single matching bean but found 2: iocDao,iocDao2”），有两个bean 
 * iocDao和iocDao2,但是我们的是iocDaox所以找不到了。（详情可以看：http://www.ulewo.com/user/10001/blog/273）
 * 
 * 2.解决上面的方法：第一种：我们在生成bean的时候就给bean定义个名称 ，例如在Dao层中
 * @Repository("myIocDao")中直接定义名称，当然在Service中定义
 * @resource
 * private IIocDao myIocDao(就行了，属性的名称一定要和上面Dao层自定义的名称一致)
 * 
 * 第二种：在注入bean的时候指定名称。
 * 这种方法就是在Service中注入bean的时候进行名称的制定，和上面的哪一种方法略有不同。
 * @Resource(name="iocDao4")
 * private IIocDao xx;这里xx是什么名字都无所谓（和在生成bean就指定 名称不同）
 * @repository("iocDao4")
 * 
 * 3.如果使用@Autowired，写法如下（因为@Aotuwired不能像resource那样带指定的参数）
 * @Autowired
 * @Qualifier("myIocDao")
 * private IIocDao xx;
 * 
 * 等同于：
 * @Resource
 * @Qualifier("myIocDao")
 * private IIocDao xx;
 * 
 * 等用于：
 * @Resource（name="myIocDao"）
 * private IIocDao xx;\
 * 
 * 总结：@Resource的作用相当于@Autowired，只不过@Autowired按byType自动注入，
 * 如果发现找到多个bean，则，又按照byName方式比对，如果还有多个，则报出异常 而@Resource
 * 默认按 byName自动注入罢了。其实spring注解，最常用的还是根据名称，根据类型啊，构造方法啊，
 * 用的非常少。所以在多个实现的时候我们定义好bean的名称就行，就不会错乱
 */

@Repository("myIocDao")
public class IocDao2 implements IIocDao{
   public void add(){
	   System.out.println("调用了dao2");
   }
}
