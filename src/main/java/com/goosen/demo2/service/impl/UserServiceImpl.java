package com.goosen.demo2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goosen.demo2.commons.dao.UserDao;
import com.goosen.demo2.commons.model.po.user.User;
import com.goosen.demo2.commons.model.response.user.UserList1;
import com.goosen.demo2.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User get(String id) {
		return userDao.get(id);
	}

	@Override
	public int insert(User entity) {
		return userDao.insert(entity);
	}

	@Override
	public int update(User entity) {
		return userDao.update(entity);
	}

	@Override
	public int delete(String id) {
		return userDao.delete(id);
	}
	
	
	@Override
	public int updateLoginInfo(User user) {
		return userDao.updateLoginInfo(user);
	}

	@Override
	public List<UserList1> findAllUserList() {
		return userDao.findAllUserList();
	}

}
