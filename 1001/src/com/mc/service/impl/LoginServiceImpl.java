package com.mc.service.impl;

import com.mc.dao.ILoginDao;
import com.mc.dao.impl.LoginDaoImpl;
import com.mc.entity.User;
import com.mc.service.ILoginService;

public class LoginServiceImpl implements ILoginService {

	@Override
	public boolean loginService(User user) {
		
		ILoginDao loginDao = new LoginDaoImpl();
		
		return loginDao.loginDao(user);
	}

	@Override
	public boolean changeIcon(User user) {
		ILoginDao loginDao = new LoginDaoImpl();
		return loginDao.changeIcon(user);
	}

	@Override
	public User getUser(String userName) {
		ILoginDao loginDao = new LoginDaoImpl();
		return loginDao.getUser(userName);
	}

}
