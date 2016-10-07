package com.mc.dao;

import com.mc.entity.User;

public interface ILoginDao {
	public boolean loginDao(User user);
	
	public boolean changeIcon(User user);
	
	public User getUser(String userName);
}
