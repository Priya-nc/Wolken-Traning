package com.wolken.monuments.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.wolken.monuments.controller.SaveController;

@Component
public class ServiceImpl implements Service{
	
	Logger logger=Logger.getLogger(SaveController.class);
	
	public void printHello() {
		logger.info("service");
		
	}
}
