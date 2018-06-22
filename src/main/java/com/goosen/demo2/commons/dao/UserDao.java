package com.goosen.demo2.commons.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goosen.demo2.commons.annotations.MyBatisDao;
import com.goosen.demo2.commons.model.po.user.User;
import com.goosen.demo2.commons.model.response.user.UserList1;


/**
 * 用户DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface UserDao extends CrudDao<User>{
	
	public int updateLoginInfo(User user);
	
	public List<UserList1> findAllUserList(@Param("id")String id,@Param("nickname")String nickname,@Param("gender")String gender);

}
