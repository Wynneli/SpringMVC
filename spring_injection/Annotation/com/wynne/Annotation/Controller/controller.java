package com.wynne.Annotation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wynne.Annotation.Service.IocService;

@Controller
public class controller {
	@Autowired
    private IocService service;
    public void testcontroller(){
    	service.testService();
    }
}
