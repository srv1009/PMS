package com.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.model.User;
import com.pms.service.UserService;

@RestController
public class RegisterController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/register")
	public String validateUser()
	{
		User user = new User();
		user.setUserName("unk");
		user.setPassword("1111");
		user.setEmail("deyavirup@gmail.com");
		userService.attemptRegisterUser(user);
		return "hi from register";
	}

}
