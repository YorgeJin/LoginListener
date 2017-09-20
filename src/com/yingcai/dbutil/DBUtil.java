package com.yingcai.dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yingcai.common.GetConnection;

/**
 * @author yorge
 *
 */
public class DBUtil {

	static Connection conn = GetConnection.getConnection();
	/**
	 * 更新数据（删除，修改，增加）
	 * @param sql
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public static boolean update(String sql,String... param) throws SQLException{
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		int a = ps.executeUpdate();
		
		boolean res = (a > 0) ? true : false;
		return res;
	}
	
	/**
	 * 查询数据
	 * @param sql
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public static ResultSet query(String sql, String... param) throws SQLException{

		PreparedStatement ps = conn.prepareStatement(sql);
		
		for(int i = 0; i < param.length; i ++) {
			ps.setString(i+1, param[i]);
		}
		
		ResultSet rs = ps.executeQuery();

		return rs;
	}
}
