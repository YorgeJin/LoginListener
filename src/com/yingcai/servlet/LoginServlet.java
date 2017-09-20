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

		//1 ȥ���ݿ���֤�Ƿ��¼�ɹ�
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		LoginBean login = new LoginBean();
		login.setUsername(username);
		login.setPassword(password);
		
		LoginService loginS = new LoginServiceIpml();
		
		boolean res = loginS.login(login);
		
		
		//2 �����¼�ɹ������浱ǰ��־
		if(res) {	//��¼�ɹ�
			
			//1 ��ȡ��ǰ�û����û�������ǰʱ�䣬 ��¼ip
			String userName = username;
			
			Date date = new Date();
			String loginTime = new SimpleDateFormat(" yy-MM-dd HH:mm:ss").format(date);
			
			String loginIp = req.getLocalAddr();
			//2  ����Ӧ���ݴ洢�����ݿ���
			
			//3  ��ת����ʾ����
			
		} else {
			
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
		
		
	}
}
