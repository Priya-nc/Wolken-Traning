package com.wolken.solarSystem;

import java.util.Scanner;

import com.wolken.solarSystem.dao.SolarSystemDAO;
import com.wolken.solarSystem.dao.SolarSystemDAOImple;
import com.wolken.solarSystem.entity.SolarSystemDetails;

public class TestSolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolarSystemDetails details = new  SolarSystemDetails() ;
		SolarSystemDAO dao= new SolarSystemDAOImple();
		Scanner scan=new Scanner(System.in);
		
		do {
		System.out.println("1: To save data \t 2: To get data \t 3: To update data \t 4:To delete data");
		int input=scan.nextInt();
		if(input==1) {
         details.setP_name("ab");
         details.setP_size(4);
         details.setMass(100);
         details.setTemperature((float) 12.5);
         boolean result=dao.save(details);
        System.out.println("data inserted"+result);
		}
		else if(input==2){
         
        
         dao.get("ab");
         }
		else if(input==3) {
			details.setP_name("abc");
	         details.setP_size(4);
	         details.setMass(100);
	         details.setTemperature((float) 12.555);
	         boolean result=dao.update(details);
	         System.out.println("data updated"+result);
		}
		else if(input==4) {
			details.setP_name("abc");
			boolean result=dao.delete(details);
	         System.out.println("data updated"+result);
	         
		}
		else {
			break;
		}
		}while(true);

	}

}
