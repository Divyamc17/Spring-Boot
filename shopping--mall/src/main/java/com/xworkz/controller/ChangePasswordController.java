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
@RequestMapping("/forgotPassword")
public class ChangePasswordController {
	@Autowired
	private AdminMallService service;
	private Logger logger = getLogger();
	
	public ChangePasswordController() {
		logger.info(getClass().getSimpleName());
	}
	@GetMapping
	public String onClick(@RequestParam String generatedPassword,@RequestParam String password,@RequestParam String password1,Model model) {
		if(generatedPassword!=null && password.equals(password1)) {
			service.updatePasswordByGeneratedPassword(generatedPassword, password1);
			model.addAttribute("message", "password is rest and updated");
			return "ChangePassword";
		}else {
			model.addAttribute("error", "password is not updated");
			return "ChangePassword";
		}
	}
	

}
