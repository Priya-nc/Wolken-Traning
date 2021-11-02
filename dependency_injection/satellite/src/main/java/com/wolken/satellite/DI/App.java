package com.wolken.satellite.DI;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.satellite.DI.satellite;


public class App 
{
    public static void main( String[] args )
    {
     Resource resource=new ClassPathResource("applicationContext.xml");
     BeanFactory beanFactory=new XmlBeanFactory(resource); 
     satellite sat=(satellite) beanFactory.getBean("satellite");
     sat.PrintName();
     
    }
}
