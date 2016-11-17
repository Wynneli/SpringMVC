package com.wynne.Annotation.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wynne.Annotation.IDao.IIocDao;
import com.wynne.Annotation.IService.I_IocService;
@Service
public class IocService implements I_IocService{
	@Resource(name="iocDao4")
	private IIocDao x;
	//private IIocDao myIocDao;
	public void testService(){
        x.add();
        //myIocDao.add();
	}
}
