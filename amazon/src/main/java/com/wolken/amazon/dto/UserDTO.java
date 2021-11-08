package com.wolken.amazon.dto;

import lombok.Data;

@Data
public class UserDTO {
	
	private int id;
	private String username;
	private String email;
	private String password;
	private String cnfpassword;
	private long contactNumber;
}
