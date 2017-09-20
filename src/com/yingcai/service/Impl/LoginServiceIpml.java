package com.yingcai.service.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yingcai.bean.LoginBean;
import com.yingcai.dao.LoginDao;
import com.yingcai.dao.Ipml.LoginDaoIpml;
import com.yingcai.service.LoginService;

public class LoginServiceIpml implements LoginService{

	LoginDao logindao = new LoginDaoIpml();
	
	public boolean login(LoginBean login){

		boolean res = false;
		
		try {
			res = logindao.queryUser(login);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

}
