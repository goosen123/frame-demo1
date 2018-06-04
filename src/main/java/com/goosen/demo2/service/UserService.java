package com.goosen.demo2.service;

import java.util.List;

import com.goosen.demo2.commons.dao.UserDao;
import com.goosen.demo2.commons.model.po.user.User;
import com.goosen.demo2.commons.model.response.user.UserList1;

public interface UserService extends BaseService,UserDao{
	
	@Override
	public int updateLoginInfo(User user);
	@Override
	public List<UserList1> findAllUserList();
	
}
