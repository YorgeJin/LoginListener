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

		// 1 ��ò�ѯ�����˺�����
		String sql = "select * from users2 where username=? and password=?";
		String username = login.getUsername();
		String password = login.getPassword();

		// 2 ȥdbutil���ҷ���
		ResultSet res = DBUtil.query(sql, username, password);

		// 3 ���ؽ��
		if (res.next()) {
			return true;
		}

		return false;
	}

}
