package com.wolken.meesho.dto;

import lombok.Data;

@Data
public class UserDTO {
	
	private int id;
	private String username;
	private String email;
	private String password;
	private long contactNumber;
}