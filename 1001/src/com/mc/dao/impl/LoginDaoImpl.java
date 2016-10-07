package com.mc.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mc.dao.ILoginDao;
import com.mc.entity.User;
import com.mc.utils.JDBCUtil;
import com.mc.utils.StringUtil;

public class LoginDaoImpl implements ILoginDao {

	@Override
	public boolean loginDao(User user) {
		String sql = "select * from user where username='" + user.getUsername() + "' and password='" + user.getPassword() + "'";
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		list = JDBCUtil.doQuery(sql);
		
		if(list !=null && list.size() == 1){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean changeIcon(User user) {
		if(user==null || StringUtil.isEmpty(user.getIcon())){
			return false;
		}
		
		String sql = "update user set icon='"+user.getIcon()+"' where username='"
					+user.getUsername()+"'";
		
		return JDBCUtil.doUpdate(sql);
	}

	@Override
	public User getUser(String userName) {
		if(userName==null){
			return null;
		}
		String sql = "select * from user where username='"+userName+"'";
		
		List<Map<String,Object>> results = JDBCUtil.doQuery(sql);
		Map<String,Object> map = results.get(0);
		
		User user = new User();
		user.setUserId((Integer)map.get("userid"));
		user.setUsername((String)map.get("username"));
		user.setIcon((String)map.get("icon"));
		
		return user;
	}
}
