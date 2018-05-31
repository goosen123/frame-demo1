package com.goosen.demo2.service;

import java.util.List;

import com.goosen.demo2.commons.dao.UserDao;
import com.goosen.demo2.commons.model.User;
import com.goosen.demo2.model.response.user.UserList;

public interface UserService extends BaseService,UserDao{
	
	@Override
	public int updateLoginInfo(User user);
	@Override
	public List<UserList> findAllUserList();
	
}
