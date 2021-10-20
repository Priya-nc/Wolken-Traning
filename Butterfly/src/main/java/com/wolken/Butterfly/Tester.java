package com.wolken.Butterfly;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wolken.Butterfly.Entity.Butterfly_details;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Configuration configuration=new Configuration();
          configuration.configure("hibernate.cfg.xml");
          SessionFactory factory=configuration.buildSessionFactory();
          Session session=factory.openSession();
          Butterfly_details details=(Butterfly_details)session.get(Butterfly_details.class, "a");
          System.out.println(details);
          session.close();
          factory.close();
	}

}
