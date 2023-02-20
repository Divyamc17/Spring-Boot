package com.xworkz.repository;

import java.util.List;

import com.xworkz.dto.CustomerDTO;

public interface CustomerRepository {

	
	boolean save(CustomerDTO dto);	

	

	List<CustomerDTO> findByName(String name);

	List<CustomerDTO> findByEmail(String email);

	List<CustomerDTO> findByMobileNo(long mobileNo);

}
