package com.wolken.mobile.dao;



import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.mobile.controller.MobileController;
import com.wolken.mobile.entity.MobileEntity;
@Component
public class MobileDaoImpl implements MobileDao {
	Logger logger=Logger.getLogger(MobileDaoImpl.class);
	@Autowired
	SessionFactory factory;
	public String save(MobileEntity entity) {
		Session session = null;
		try {
	    	session = factory.openSession();
	    	Transaction tx = session.beginTransaction();
	    	logger.info(entity);
	    	session.save(entity);
	    	tx.commit();
		}
		catch(Exception e) {
			logger.error("Connection is not eshtablished");
			return "Save Failed";
		}
		finally {
			if(session!=null)
				logger.info("session closing");
				session.close();
		}
		
		return "Saved Successfully";
		
	}

}
