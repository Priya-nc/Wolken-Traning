package com.wolken.monuments.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wolken.monuments.dao.DetailsDAO;
import com.wolken.monuments.dto.DetailsDTO;
import com.wolken.monuments.entity.DetailsEntity;
import com.wolken.monuments.service.Service;
import com.wolken.monuments.service.ServiceImpl;

@Controller
public class SaveController {

	@Autowired
	ServiceImpl service;
	
	Logger logger=Logger.getLogger(SaveController.class);

	@RequestMapping(value="save", method=RequestMethod.POST)
	
	String saveDetails(DetailsDTO dto){
		
		logger.info(dto);
		DetailsEntity entity=new DetailsEntity();
		BeanUtils.copyProperties(dto, entity);
		
		logger.info(entity);
		service.printHello(entity);
		return "welcome.jsp";
			
	}
	
	
	
	
}
