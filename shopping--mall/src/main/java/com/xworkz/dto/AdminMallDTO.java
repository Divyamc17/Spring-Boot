package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mall_admin")
@NamedQuery(name = "findByAdminNameAndpassword", query = "select mall from AdminMallDTO mall where mall.adminName=:nm and mall.password=:pd")
@NamedQuery(name = "updateNoOfWrongAttemptsByName", query = "update AdminMallDTO mall set mall.noOfWrongAttempt=:na where mall.adminName=:nm")
@NamedQuery(name = "findByName", query = "select mall from AdminMallDTO mall where mall.adminName=:nm")
@NamedQuery(name = "updatefirstStatusByName", query = "update AdminMallDTO mall set mall.firstLogin=:lg where mall.adminName=:nm")
@NamedQuery(name = "updateAccountLockedByName", query = "update AdminMallDTO mall set mall.accountLocked=:al where mall.adminName=:nm")
@NamedQuery(name = "updateGeneratedPasswordByName", query = "update AdminMallDTO mall set mall.generatedPassword=:gpas where mall.adminName=:nm")
@NamedQuery(name = "updatePasswordByGeneratedPassword", query = "update AdminMallDTO mall set mall.password=:ps where mall.generatedPassword=:gs")
@NamedQuery(name = "findByMallName", query = "select mall from AdminMallDTO mall where mall.name=:name")
@NamedQuery(name = "updateGeneratedPasswordByMallName", query = "update AdminMallDTO mall set mall.generatedPassword=:gs where mall.name=:mn")
@NamedQuery(name = "updateLoginCountByAdminName", query = "update AdminMallDTO mall set mall.loginCount=:lc where mall.name=:nm")
@NamedQuery(name = "updateTimeByMallName", query = "update AdminMallDTO mall set mall.time=:ti where mall.name=:mn")
@NamedQuery(name = "updateAcountUnlockByName", query = "update AdminMallDTO mall set mall.accountLocked=:al where mall.adminName=:nm")
@NamedQuery(name = "updateNoOfWrongAttemptsByMallName", query = "update AdminMallDTO mall set mall.noOfWrongAttempt=:noof where mall.name=:mn")
@NamedQuery(name = "findByGeneratedPassword", query = "select mall from AdminMallDTO mall where mall.generatedPassword=:ps")
@NamedQuery(name = "updateGeneratedPasswordTimeByGeneratedPassword", query = "update AdminMallDTO mall set mall.generatedPasswordTime=:gpt where mall.generatedPassword=:gp")

public class AdminMallDTO extends AbstractDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Mall_Name")
	private String name;
	@Column(name = "Admin_Name")
	private String adminName;
	@Column(name = "Password")
	private String password;
	@Column(name = "Active")
	private boolean active;
	@Column(name = "Account_Locked")
	private String accountLocked;
	@Column(name = "No_Of_Wrong_Attempts")
	private int noOfWrongAttempt;
	@Column(name = "Mall_Email")
	private String mallEmail;
	@Column(name = "firstLogin")
	private int firstLogin;
	@Column(name = "genaratedPassword")
	private String generatedPassword;
	@Column(name = "loginCount")
	private int loginCount;
	@Column(name = "time")
	private LocalTime time;
	@Column(name = "genaratedPasswordTime")
	private LocalTime generatedPasswordTime;

	public AdminMallDTO(String createdBy, LocalDateTime createdByDate, String updatedBy, LocalDateTime updatedByDate,
			String name, String adminName, String password, boolean active, String accountLocked, int noOfWrongAttempt,
			String mallEmail, int firstLogin, String generatedPassword, int loginCount, LocalTime time,
			LocalTime generatedPasswordTime) {
		super(createdBy, createdByDate, updatedBy, updatedByDate);
		this.name = name;
		this.adminName = adminName;
		this.password = password;
		this.active = active;
		this.accountLocked = accountLocked;
		this.noOfWrongAttempt = noOfWrongAttempt;
		this.mallEmail = mallEmail;
		this.firstLogin = firstLogin;
		this.generatedPassword = generatedPassword;
		this.loginCount = loginCount;
		this.time = time;
		this.generatedPasswordTime = generatedPasswordTime;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(String accountLocked) {
		this.accountLocked = accountLocked;
	}

	public int getNoOfWrongAttempt() {
		return noOfWrongAttempt;
	}

	public void setNoOfWrongAttempt(int noOfWrongAttempt) {
		this.noOfWrongAttempt = noOfWrongAttempt;
	}

	public String getMallEmail() {
		return mallEmail;
	}

	public void setMallEmail(String mallEmail) {
		this.mallEmail = mallEmail;
	}

	public int getFirstLogin() {
		return firstLogin;
	}

	public void setFirstLogin(int firstLogin) {
		this.firstLogin = firstLogin;
	}

	public String getGeneratedPassword() {
		return generatedPassword;
	}

	public void setGeneratedPassword(String generatedPassword) {
		this.generatedPassword = generatedPassword;
	}

	public int getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalTime getGeneratedPasswordTime() {
		return generatedPasswordTime;
	}

	public void setGeneratedPasswordTime(LocalTime generatedPasswordTime) {
		this.generatedPasswordTime = generatedPasswordTime;
	}


}
