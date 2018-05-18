package com.goosen.demo2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goosen.demo2.dao.UserDao;
import com.goosen.demo2.entity.User;
import com.goosen.demo2.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
//	@Autowired
//	private UserDao userDao;
//
//	@Override
//	public String insertest(String testStr) {
//		return testStr;
//	}
//
//	@Override
//	public int updateLoginInfo(User user) {
//		return userDao.updateLoginInfo(user);
//	}
//
//	@Override
//	public List<User> findAllUserList() {
//		return userDao.findAllUserList();
//	}
//	
////	@Override
////	public List<User> selectByUser(User user, int page, int rows){
////		Example example = new Example(User.class);
////        Example.Criteria criteria = example.createCriteria();
////        if (user.getNickname() != null) {
////            criteria.andLike("nickname", "%" + user.getNickname() + "%");
////        }
////        if (user.getId() != null) {
////            criteria.andEqualTo("id", user.getId());
////        }
////        //分页查询
////        PageHelper.startPage(page, rows);
////        return selectByExample(example);
////	}

}
