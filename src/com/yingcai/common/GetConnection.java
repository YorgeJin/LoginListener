package com.yingcai.common;

import java.sql.Connection;
import java.sql.DriverManager;


public class GetConnection {

	static Connection conn = null; 
	
	public static Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"c##yorge","123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
