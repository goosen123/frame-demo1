package com.goosen.demo2.service;

import java.util.List;

import com.goosen.demo2.entity.User;

public interface PersonService {
	String insertest(String testStr);
	int updateLoginInfo(User user);
	List<User> findAllUserList();
}
