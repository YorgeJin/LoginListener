package com.yingcai.bean;

public class LoginLogBean {

	private String userName;
	private String loginTime;
	private String loginIp;
	
	public LoginLogBean() {
		super();
	}
	public LoginLogBean(String userName, String loginTime, String loginIp) {
		super();
		this.userName = userName;
		this.loginTime = loginTime;
		this.loginIp = loginIp;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	
}
