package com.yingcai.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yingcai.bean.LoginBean;
import com.yingcai.service.LoginService;
import com.yingcai.service.Impl.LoginServiceIpml;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1 去数据库验证是否登录成功
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		LoginBean login = new LoginBean();
		login.setUsername(username);
		login.setPassword(password);
		
		LoginService loginS = new LoginServiceIpml();
		
		boolean res = loginS.login(login);
		
		
		//2 如果登录成功，保存当前日志
		if(res) {	//登录成功
			
			//1 获取当前用户的用户名，当前时间， 登录ip
			String userName = username;
			
			Date date = new Date();
			String loginTime = new SimpleDateFormat(" yy-MM-dd HH:mm:ss").format(date);
			
			String loginIp = req.getLocalAddr();
			//2  把相应数据存储到数据库中
			
			//3  跳转到显示界面
			
		} else {
			
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
		
		
	}
}
