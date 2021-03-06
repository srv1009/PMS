package com.pms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.dao.LoginDAO;
import com.pms.model.User;
import com.pms.model.UserAuth;
import com.pms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private OtpServiceImpl otpService;
	@Autowired
	private LoginDAO loginDAO;
	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String attemptRegisterUser(User user) {
		// register
		loginDAO.validateUser(user);
		return null;
	}

	@Override
	public boolean authenticateUser(UserAuth userData) {
		// TODO Auto-generated method stub
		return false;
	}

}
