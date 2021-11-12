package com.wolken.mobile.services;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wolken.mobile.controller.MobileController;
import com.wolken.mobile.dao.MobileDao;
import com.wolken.mobile.dto.MobileDto;
import com.wolken.mobile.entity.MobileEntity;

@Service

public class MobileServiceImpl implements MobileService{
	MobileEntity entity=new MobileEntity();
@Autowired

MobileDao dao;
	public String validateSave(MobileDto dto) {
		Logger logger=Logger.getLogger(MobileController.class);
		if(dto!=null) {
			BeanUtils.copyProperties(dto, entity);
			logger.info("Have some data");
		}
		else {
			logger.error("enter valid details");
		}
		return dao.save(entity);
	}

}
