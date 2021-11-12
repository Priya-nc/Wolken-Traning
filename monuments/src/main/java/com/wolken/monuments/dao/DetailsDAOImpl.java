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
     public String save(DetailsEntity entity) {
    	 try {
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	logger.info("transaction begins");
    	session.save(entity);
    	logger.info("transaction ends");
    	transaction.commit();
    	session.close();
    	 }
    	 catch(Exception e) {
 			logger.error("Connection is not eshtablished");
 			return "Save Failed";
 		}
 		finally {
 			Session session=factory.openSession();
 			if(session!=null)
 				logger.info("session closing");
 				session.close();
 		}
    	return "added";
     }
}
