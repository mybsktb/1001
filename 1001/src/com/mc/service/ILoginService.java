package com.mc.service;

import com.mc.entity.User;

public interface ILoginService {
	public boolean loginService(User user);
	
	public boolean changeIcon(User user);
	
	public User getUser(String userName);
}
