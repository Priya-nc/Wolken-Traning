package com.wolken.monuments.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.wolken.monuments.entity.DetailsEntity;

@Component
public class DetailsDAOImpl implements DetailsDAO{
     @Autowired 
     SessionFactory factory;
     
     public void save(DetailsEntity entity) {
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	session.save(entity);
    	transaction.commit();
    	session.close();
    	
     }
}
