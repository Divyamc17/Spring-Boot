package com.xworkz.controller;

import static com.xworkz.logger.Loggers.getLogger;

import java.util.logging.Logger;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.dto.AdminMallDTO;
import com.xworkz.service.AdminMallService;


@Controller
@RequestMapping("/login")
public class AdminMallController {

	@Autowired
	private AdminMallService adminMallService;
	private Logger logger= getLogger();

	public AdminMallController() {
		logger.info("default AdminMallController");
	}

	@SuppressWarnings("unused")
	@GetMapping
	public String onLogin(Model model, @RequestParam String adminName, @RequestParam String password) {
		logger.info("running on login methos");
		AdminMallDTO findByAdminNameAndpassword = adminMallService.findByAdminNameAndpassword(adminName,password);
		AdminMallDTO findByName = adminMallService.findByName(adminName);
		if(findByAdminNameAndpassword == null || findByName == null) {
			logger.info("given credentila are invalid");
			model.addAttribute("error", "credentil are not matching   ============");
		
		if (findByName != null && findByName.getAccountLocked().equals("locked")) {
			logger.info("Account is locked");
			model.addAttribute("error1", "your account is locked please reset the password");
			return "adminlogin";
		}
		return "adminlogin";
	}
		if (findByAdminNameAndpassword != null ) {
			
			try {
			
			if (findByAdminNameAndpassword.getAccountLocked().equals("Unlocked") && findByAdminNameAndpassword.getLoginCount() > 1) {
				logger.info("Account is unlocked");
				model.addAttribute("message", "credentials are matched");
				model.addAttribute("dto", findByAdminNameAndpassword);
				return "AdminSuccess";
			}
			if (findByAdminNameAndpassword.getLoginCount() <= 1) {
					logger.info("welcome to our page please change your password");
					model.addAttribute("message", "congratulation you have in logged please change your password");
					return "ChangePassword";
			}
				return "adminlogin";
			}catch(NoResultException e)
			{
				System.out.println("Inside a NoResultException");
				e.printStackTrace();
			}
			
		}
			return "adminlogin";

	}
	
}
