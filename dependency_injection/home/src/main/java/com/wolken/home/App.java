package com.wolken.home;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class App 
{
    public static void main( String[] args )
    {
    
    	 Resource resource=new ClassPathResource("applicationContext.xml");
         BeanFactory beanFactory=new XmlBeanFactory(resource); 
         Home sat=(Home) beanFactory.getBean("home");
         sat.PrintName();
    }
}
