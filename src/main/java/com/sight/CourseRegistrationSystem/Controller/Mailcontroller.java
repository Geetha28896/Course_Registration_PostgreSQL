package com.sight.CourseRegistrationSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mailcontroller {
	
	@Autowired
	private JavaMailSender javamailSender;
	
	 
	@GetMapping("/sendmail")
	public String grtmail() {
		
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setFrom("ss <antonysightspectrum@outlook.com>");
		mail.setSubject("Demo mail");
		mail.setTo("geethabts08.sightspectrum@outlook.com");
		mail.setText("hiiiiiiiii Geetha");
		javamailSender.send(mail);
		 
		return ("redirect:/");
		
	}
}
