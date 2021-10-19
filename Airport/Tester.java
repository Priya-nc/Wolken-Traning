package com.wolken.market.map;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 Abstract ab=new Abstract_imple();
		 Encapsulated en=new Encapsulated();
	     int n=scan.nextInt();
	     if(n==1) {
        
        
         en.setId(5);
         en.setName("abc");
         en.setLocation("ban");
         en.setNo_of_airlines(10);
         
         boolean result=ab.save(en);
         if(result)
         System.out.println("Values are added");
         else
        	 System.out.println("Values are not added");
	     }
	      else if(n==2) {
	    	  ab.displayAll(en);
	     }
	      else if(n==3) {
	    	  en.setId(2);
	    	  en.setName("priya");
	    	  ab.update(en);
	      }
	      else if(n==4) {
	    	  en.setName("priya");
	    	  boolean a=ab.deleteByName(en);
	    	  System.out.println(a);
	      }
        	 
         
	}

}
