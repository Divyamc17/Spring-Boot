package com.xworkz.service;

import com.xworkz.dto.AdminMallDTO;

public interface AdminMallService {

	AdminMallDTO findByAdminNameAndpassword(String adminName,String password);
	
	 //List<AdminMallDTO> updateFailedattempts(String adminName,int noOfWrongAttempt);
	
	default boolean sendMail(String email,String password) {
		return true;
		
	}
	AdminMallDTO findByName(String adminName);
	
	AdminMallDTO updatePasswordByGeneratedPassword(String generatedPassword,String password);

	AdminMallDTO findByMallName(String name);
	
	AdminMallDTO updateAcountUnlockByName(String adminName,String accountLocked);
	
	
}
