package com.wolken.monuments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.monuments.service.Service;
@Controller
public class HelloController {
   
	@RequestMapping("/hello")
	String PrintHello() {
		System.out.println("controller is calling");
		
		return "welcome.jsp";
		
	}
	
}
