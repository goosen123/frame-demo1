package com.goosen.demo2.commons.dao;

import java.util.List;

import com.goosen.demo2.commons.annotations.MyBatisDao;
import com.goosen.demo2.commons.model.User;
import com.goosen.demo2.model.response.user.UserList;


/**
 * 用户DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface UserDao extends CrudDao<User>{
	
	public int updateLoginInfo(User user);
	
	public List<UserList> findAllUserList();

}