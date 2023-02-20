package com.xworkz.controller;

import static com.xworkz.logger.Loggers.getLogger;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.dto.CustomerFeedBackDTO;
import com.xworkz.service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService service;
	private Logger logger = getLogger();
			
	
	public CustomerController() {
		logger.info("Default CustomerController");
	}
	@PostMapping
	public String onSave(CustomerDTO dto,Model model,CustomerFeedBackDTO dto2) {
		logger.info("on send method running");
		boolean findByEmail = service.findByEmail(dto.getEmail());
		boolean findByMobileNo = service.findByMobileNo(dto.getMobileNo());
		
		if(!findByEmail) {
			logger.info(dto.getEmail());
			model.addAttribute("error", "Email already exist");
			return "CustomerInformation";
			
		}else if(!findByMobileNo) {
			System.out.println(dto.getMobileNo());
			model.addAttribute("error", "mobile no is already exist");
			return "CustomerInformation";
			
		}else {
			dto.setFeedBackDTO(dto2);
			boolean validateAndSave = service.validateAndSave(dto);
			if(validateAndSave) {
				logger.info("Saving data ");
				model.addAttribute("message", "Saved successfully");
				model.addAttribute("dto", dto);
				model.addAttribute("dto2", dto2);
				return "success";
			}else {
				logger.info("Data not saving");
				model.addAttribute("error", "data not saved please check");
				return "Customerinformation";
			}
		}
		
		

	}
	
	

}
