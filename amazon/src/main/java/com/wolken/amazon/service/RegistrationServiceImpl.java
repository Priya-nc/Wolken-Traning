package com.wolken.amazon.service;

import java.util.Objects;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.amazon.dao.RegistrationDAO;
import com.wolken.amazon.dto.LoginDTO;
import com.wolken.amazon.dto.UserDTO;
import com.wolken.amazon.entity.LoginEntity;
import com.wolken.amazon.entity.UserEntity;

public class RegistrationServiceImpl implements RegistrationService {
	Scanner scanner=new Scanner(System.in);
	public String validateandsave(UserDTO dto) {
		UserEntity entity=new UserEntity();
		if(dto.getId()>0) {
			if(!dto.getUsername().equals(null) && !dto.getUsername().equals("")) {
				if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
					if(dto.getContactNumber()>5999999999l && dto.getContactNumber()<9999999999l) {
						if(dto.getPassword().equals(dto.getCnfpassword()) ) {
							RegistrationDAO dao= (RegistrationDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
							entity.setId(dto.getId());
							entity.setUsername(dto.getUsername());
							entity.setEmail(dto.getEmail());
							entity.setContactNumber(dto.getContactNumber());
							entity.setPassword(dto.getPassword());
							
							int rows = dao.save(entity);
							if(rows>0) {
								return "Data Saved";
							}else {
								return "Data not saved";
							}
							
						}else{
							return "Password and confirm password has to be same";
						}
					}else{
						return "Please provide valid phone number";
					}
				}else{
					return "Please provide valid Email Id";
				}
			}else{
				return "Please enter username";
			}
		}else{
			return "Please provide valid Id";
		}
		
	}

	public String validateandLogin(LoginDTO loginDTO) {
		RegistrationDAO dao= (RegistrationDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
		
		if(!Objects.isNull(loginDTO)) {
			if(!loginDTO.getEmail().equals(null) && !loginDTO.getEmail().equals("")) {
				
				LoginEntity entity=dao.getByEmail(loginDTO.getEmail());
				if(loginDTO.getPassword().equals(entity.getPassword())) {
					return "Login Sucessfull";
				}else {
					return "Enter valid Password";
				}
			}else {
				return "Enter valid Email";
			}
		}else {
			return "Object is null";
		}
	}

	public String validateandUpdatePassword(LoginDTO loginDTO) {
		RegistrationDAO dao= (RegistrationDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
		
		if(!loginDTO.getEmail().equals(null) && !loginDTO.getEmail().equals("")) {
			
			LoginEntity entity=dao.getByEmail(loginDTO.getEmail());
			if(entity!=null) {
			System.out.println("Enter Password");
			String password=scanner.nextLine();
			System.out.println("Enter confirm Password");
			String repassword=scanner.nextLine();
				if(password.equals(repassword)) {
					entity.setEmail(loginDTO.getEmail());
					entity.setPassword(password);
					
					int isUpdate=dao.forgotPassword(entity);
					if(isUpdate>0) {
						return "Password Updated";
						
					}else {
						return "Password not Updated";
					}
				}else{
					return "Password and confirm password has to be same";
				}
			}else {
				return "Enter valid Email";
			}
		}else {
			return "Enter valid Email";
		}
		
	}

}
