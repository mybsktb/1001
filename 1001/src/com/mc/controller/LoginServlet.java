package com.mc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mc.entity.User;
import com.mc.service.ILoginService;
import com.mc.service.impl.LoginServiceImpl;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		ILoginService loginServiceImpl = new LoginServiceImpl();
		boolean result = loginServiceImpl.loginService(user);
		
		if(result){
			User user1 = loginServiceImpl.getUser(username);
			req.getSession().setAttribute("userNm", username);
			req.getSession().setAttribute("icon", user1.getIcon());
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} else {
			req.setAttribute("info", "用户名或密码错误！");
		}
		
	}

}
