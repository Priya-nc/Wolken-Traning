package com.wolken.amazon.service;

import com.wolken.amazon.dto.LoginDTO;
import com.wolken.amazon.dto.UserDTO;

public interface RegistrationService {

	String validateandsave(UserDTO dto);

	String validateandLogin(LoginDTO loginDTO);

	String validateandUpdatePassword(LoginDTO loginDTO);

}
