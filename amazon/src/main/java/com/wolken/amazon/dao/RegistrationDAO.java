package com.wolken.amazon.dao;

import com.wolken.amazon.entity.LoginEntity;
import com.wolken.amazon.entity.UserEntity;

public interface RegistrationDAO {

	int save(UserEntity entity);

	LoginEntity getByEmail(String email);

	int forgotPassword(LoginEntity entity);

}
