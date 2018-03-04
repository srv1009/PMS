package com.pms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.pms.model.User;

@Service
public class OtpServiceImpl {

	private JavaMailSender jms;
	
	@Autowired
	public OtpServiceImpl(JavaMailSender jms) {
		this.jms = jms;
	}
	
	public void sendMail(User user)
	{
		try {
			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setTo(user.getEmail());
			mail.setFrom("topthings81@gmail.com");
			mail.setCc("saurav.agarwala17@gmail.com");
			mail.setSubject("Hey, i have nothing else to do.");
			mail.setText("OTP : 123456");
			jms.send(mail);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
