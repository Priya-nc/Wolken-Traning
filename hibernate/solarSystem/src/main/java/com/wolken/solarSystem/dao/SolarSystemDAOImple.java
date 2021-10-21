package com.wolken.solarSystem.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.wolken.solarSystem.entity.SolarSystemDetails;
import com.wolken.solarSystem.utils.HibernateUtils;

public class SolarSystemDAOImple implements SolarSystemDAO{

	public boolean save(SolarSystemDetails details) {
		 SessionFactory factory=HibernateUtils.getInstance();
         Session session=factory.openSession();
         Transaction transaction=session.beginTransaction();
         
         
         session.save(details);
         transaction.commit();
         session.close();
		return true;
		
	}

	public boolean delete(SolarSystemDetails details) {
		 SessionFactory factory=HibernateUtils.getInstance();
         Session session=factory.openSession();
         Transaction transaction=session.beginTransaction();
         
         
         session.delete(details);
         transaction.commit();
         session.close();
		return true;
		
	}

	public boolean update(SolarSystemDetails details) {
		
		 SessionFactory factory=HibernateUtils.getInstance();
         Session session=factory.openSession();
         Transaction transaction=session.beginTransaction();
         
         
         session.saveOrUpdate(details);
         transaction.commit();
         session.close();
		return true;
	}

	public void get(String p_name) {
		SolarSystemDetails details;
		SessionFactory factory=HibernateUtils.getInstance();
        Session session=factory.openSession();
        
        details=(SolarSystemDetails)session.get(SolarSystemDetails.class,p_name);
        System.out.println(details);
        
        session.close();
		
	}

	
	
}
