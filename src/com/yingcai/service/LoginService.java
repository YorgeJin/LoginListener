package com.yingcai.service;

import java.sql.SQLException;
import java.util.List;

import com.yingcai.bean.LoginBean;

public interface LoginService {


	/**
	 * ��¼
	 * @param login
	 * @return
	 */
	public boolean login(LoginBean login);
		
}
