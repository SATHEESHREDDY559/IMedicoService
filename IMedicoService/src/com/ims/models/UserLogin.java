package com.ims.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="loggingtable")
public class UserLogin {

	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="Username")
	private String Username;
	

	@Column(name="Logintime")
	private Date logintime;
	
	@Column(name="Logouttime")
	private Date logouttime;
	
	@Column(name="UserRole")
	private String userrole;
	
	@Column(name="attempt")
	private String attempt;

	public Date getLogouttime() {
		return logouttime;
	}

	public void setLogouttime(Date logouttime) {
		this.logouttime = logouttime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public String getAttempt() {
		return attempt;
	}

	public void setAttempt(String attempt) {
		this.attempt = attempt;
	}

	
	
}
