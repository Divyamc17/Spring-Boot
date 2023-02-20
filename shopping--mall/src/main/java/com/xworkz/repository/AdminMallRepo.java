package com.xworkz.repository;

import java.time.LocalTime;

import com.xworkz.dto.AdminMallDTO;

public interface AdminMallRepo {

	
	//boolean save(AdminMallDTO adminMallDTO);
	
		AdminMallDTO findByAdminNameAndpassword(String adminName,String password);
		
		AdminMallDTO updateNoOfWrongAttemptsByName(String adminName,int noOfWrongAttempt);
		
		AdminMallDTO findByName(String adminName);
		
		AdminMallDTO updatefirstLoginByName(String adminName,int firstLogin);
		
		AdminMallDTO updateAccountLockedByName(String adminName,String accountLocked);
		
		AdminMallDTO updateGeneratedPasswordByName(String adminName,String generatedPassword);
		
		AdminMallDTO updatePasswordByGeneratedPassword(String generatedPassword,String password);
		
		AdminMallDTO findByMallName(String name);
		
		AdminMallDTO updateGeneratedPasswordByMallName(String name,String generatedPassword);
		
		AdminMallDTO updateLoginCountByAdminName(String adminName,int loginCount);
		
		AdminMallDTO updateTimeByMallName(String name,LocalTime time);
		
		AdminMallDTO updateAcountUnlockByName(String name,String accountLocked);
		
		AdminMallDTO updateNoOfWrongAttemptsByMallName(String name,int noOfWrongAttempt);
		
		AdminMallDTO findByGeneratedPassword(String generatedPassword);
		
		AdminMallDTO updateGeneratedPasswordTimeByGeneratedPassword(String generatedPassword,LocalTime generatedPasswordTime);
	
	
}
