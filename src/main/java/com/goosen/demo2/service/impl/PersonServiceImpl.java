package com.goosen.demo2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.goosen.demo2.commons.dao.UserDao;
import com.goosen.demo2.commons.model.po.user.User;
import com.goosen.demo2.commons.model.request.BasePageReqData;
import com.goosen.demo2.commons.model.response.BaseListRespData;
import com.goosen.demo2.commons.model.response.BasePageRespData;
import com.goosen.demo2.commons.model.response.user.UserList1;
import com.goosen.demo2.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public String insertest(String testStr) {
		return testStr;
	}

	@Override
	public int updateLoginInfo(User user) {
		return userDao.updateLoginInfo(user);
	}

	@Override
	public List<UserList1> findAllUserList() {
		return userDao.findAllUserList();
	}

	@Override
	public BaseListRespData<UserList1> findAllUserList2() {
		BaseListRespData<UserList1> baseListRespData = new BaseListRespData<UserList1>();
		List<UserList1> list = userDao.findAllUserList();
		baseListRespData.setList(list);
		return baseListRespData;
	}

	@Override
	public BasePageRespData<UserList1> findUserPage(BasePageReqData pageQO) {
		Page<UserList1> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize(), pageQO.getOrderBy());
		userDao.findAllUserList();
		return BasePageRespData.build(page);
	}
	
//	@Override
//	public List<User> selectByUser(User user, int page, int rows){
//		Example example = new Example(User.class);
//        Example.Criteria criteria = example.createCriteria();
//        if (user.getNickname() != null) {
//            criteria.andLike("nickname", "%" + user.getNickname() + "%");
//        }
//        if (user.getId() != null) {
//            criteria.andEqualTo("id", user.getId());
//        }
//        //分页查询
//        PageHelper.startPage(page, rows);
//        return selectByExample(example);
//	}

}
