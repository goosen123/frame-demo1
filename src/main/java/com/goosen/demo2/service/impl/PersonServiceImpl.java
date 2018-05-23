package com.goosen.demo2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.goosen.demo2.commons.model.qo.PageQO;
import com.goosen.demo2.commons.model.vo.PageVO;
import com.goosen.demo2.dao.UserDao;
import com.goosen.demo2.entity.User;
import com.goosen.demo2.entity.response.BaseListRespData;
import com.goosen.demo2.entity.response.UserList;
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
	public List<UserList> findAllUserList() {
		return userDao.findAllUserList();
	}

	@Override
	public BaseListRespData<UserList> findAllUserList2() {
		BaseListRespData<UserList> baseListRespData = new BaseListRespData<UserList>();
		List<UserList> list = userDao.findAllUserList();
		baseListRespData.setList(list);
		return baseListRespData;
	}

	@Override
	public PageVO<UserList> findUserPage(PageQO pageQO) {
		Page<UserList> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize(), pageQO.getOrderBy());
		userDao.findAllUserList();
		return PageVO.build(page);
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
