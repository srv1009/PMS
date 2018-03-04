package com.pms.service.impl;

import com.pms.model.User;
import com.pms.model.UserAuth;
import com.pms.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String attemptRegisterUser(User user) {
		// register
		return "hi";
	}

	@Override
	public boolean authenticateUser(UserAuth userData) {
		// TODO Auto-generated method stub
		return false;
	}

}
