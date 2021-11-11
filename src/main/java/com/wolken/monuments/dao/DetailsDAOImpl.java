package com.wolken.monuments.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.monuments.controller.SaveController;
import com.wolken.monuments.entity.DetailsEntity;

@Component
public class DetailsDAOImpl implements DetailsDAO{
     @Autowired 
     SessionFactory factory;
     Logger logger=Logger.getLogger(SaveController.class);
     public void save(DetailsEntity entity) {
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	logger.info("transaction begins");
    	session.save(entity);
    	logger.info("transaction ends");
    	transaction.commit();
    	session.close();
    	
     }
}
