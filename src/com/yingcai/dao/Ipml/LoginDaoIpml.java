package com.yingcai.dao.Ipml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yingcai.bean.LoginBean;
import com.yingcai.dao.LoginDao;
import com.yingcai.dbutil.DBUtil;

public class LoginDaoIpml implements LoginDao {

	public boolean queryUser(LoginBean login) throws SQLException {

		// 1 获得查询到的账号密码
		String sql = "select * from users2 where username=? and password=?";
		String username = login.getUsername();
		String password = login.getPassword();

		// 2 去dbutil中找方法
		ResultSet res = DBUtil.query(sql, username, password);

		// 3 返回结果
		if (res.next()) {
			return true;
		}

		return false;
	}

}
