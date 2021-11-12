package com.wolken.mobile.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.wolken.mobile.dto.MobileDto;
import com.wolken.mobile.services.MobileService;
@Controller
public class MobileController {
	@Autowired
	
	MobileService service;
	Logger logger=Logger.getLogger(MobileController.class);
	@RequestMapping(value="save", method=RequestMethod.POST)
	String save(MobileDto dto) {
		//ModelAndView view = new ModelAndView();
		logger.info(dto);
		logger.info("validating");
		String out = service.validateSave(dto);
//		view.setViewName("hello");
//		view.addObject("out", out);
		return "hi.jsp";
	}
}
