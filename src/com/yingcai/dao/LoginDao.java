package com.yingcai.dao;

import java.sql.SQLException;
import java.util.List;

import com.yingcai.bean.LoginBean;

public interface LoginDao {

	/**
	 * 查询是否有该用户
	 * @param login
	 * @return
	 * @throws SQLException
	 */
	public boolean queryUser(LoginBean login) throws SQLException;
	
}
