package com.wolken.PG;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.PG.Pg;


public class App 
{
  public static void main( String[] args )
  {
   Resource resource=new ClassPathResource("applicationContext.xml");
   BeanFactory beanFactory=new XmlBeanFactory(resource); 
   Pg pg=(Pg) beanFactory.getBean("satellite");
   pg.PrintName();
   
  }
}