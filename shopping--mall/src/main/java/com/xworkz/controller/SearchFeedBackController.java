package com.xworkz.controller;

import static com.xworkz.logger.Loggers.getLogger;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.service.CustomerService;



@Controller
@RequestMapping("/search")

public class SearchFeedBackController {

	@Autowired
	private CustomerService service;
	private Logger logger = getLogger();
	
	public SearchFeedBackController() {
		logger.info("deafult SearchFeedBackController ");
	}
	@PostMapping
	public String onSearch(@RequestParam String name, Model model) {
		List<CustomerDTO> findByName = service.findByName(name);
		
		if(findByName == null) {
			model.addAttribute("error", "No Result Found");
			return "SearchFeedBack";
		}else {
			model.addAttribute("message", "results");
			model.addAttribute("list", findByName);
			return "SearchFeedBack";
		}
		
		
	}
	
	
	
}
