package com.goosen.demo2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.goosen.demo2.dao.UserDao;
import com.goosen.demo2.entity.User;
import com.goosen.demo2.entity.response.UserList;

@Service
public interface UserService extends BaseService,UserDao{
	
	@Override
	public int updateLoginInfo(User user);
	@Override
	public List<UserList> findAllUserList();
	
}
