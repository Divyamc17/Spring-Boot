package com.xworkz.controller;

import static com.xworkz.logger.Loggers.getLogger;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.service.AdminMallService;

@Controller
@RequestMapping("/reset")

public class ResetPasswordController {
	
	@Autowired
	private AdminMallService service; 
	
	private Logger logger = getLogger();
	
	public ResetPasswordController() {
		logger.info("Default RestePasswordController");
	}
@SuppressWarnings("unused")
@GetMapping()
	public String onForgot(@RequestParam String name,Model model) {
	if(name != null) {
		this.service.findByMallName(name);
		model.addAttribute("message", "password is sent to your mail id");
		return "ChangePassword";
		
	}else {
		if(name == null) {
		model.addAttribute("error", "selected mall is not found");
		return "ResetPassword";
	}
	}
	return null;
		
	}
	

}
