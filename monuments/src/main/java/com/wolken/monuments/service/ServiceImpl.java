package com.wolken.monuments.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.monuments.dao.DetailsDAOImpl;
import com.wolken.monuments.entity.DetailsEntity;

@Component
public class ServiceImpl implements Service{
	
	Logger logger=Logger.getLogger(ServiceImpl.class);
	@Autowired
	DetailsDAOImpl dao;
	public String printHello(DetailsEntity entity) {
		logger.info("Validating");
		if(entity!=null) {
		return dao.save(entity);
		}
		else {
			logger.error("Validated failed");
			return null;
		
		}
		
	}
}
