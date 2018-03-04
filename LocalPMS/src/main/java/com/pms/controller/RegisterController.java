package com.pms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	
	@RequestMapping("/register")
	public String validateUser()
	{
		return "hi from register";
	}

}
