package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.CustomerDTO;

public interface CustomerService {

boolean validateAndSave(CustomerDTO dto);
	
	//boolean validateAndSave(CustomerFeedBackDTO dto);
	
	List<CustomerDTO> findByName(String name);
	
	boolean findByEmail(String email);
	
	boolean findByMobileNo(long mobileNo);
	
	default boolean sendMail(String email) {
		return true;
	}
	
	
}
