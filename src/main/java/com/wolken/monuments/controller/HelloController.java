package com.wolken.monuments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.monuments.service.Service;
@Controller
public class HelloController {
	
	@Autowired
	Service service;
	
	@RequestMapping(value="send")
	String PrintHello() {
		
		
		service.printHello();
		return "index.jsp";
		
		
	}
	
}
