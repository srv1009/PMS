package com.pms.service;

import com.pms.model.User;
import com.pms.model.UserAuth;

public interface UserService {

	public boolean validateUser(User user);
	public String attemptRegisterUser(User user);
	public boolean authenticateUser(UserAuth userData);
}
