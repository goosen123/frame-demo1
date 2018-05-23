package com.goosen.demo2.service;

import java.util.List;

import com.goosen.demo2.commons.model.qo.PageQO;
import com.goosen.demo2.commons.model.vo.PageVO;
import com.goosen.demo2.entity.User;
import com.goosen.demo2.entity.response.BaseListRespData;
import com.goosen.demo2.entity.response.UserList;

public interface PersonService{
	String insertest(String testStr);
	int updateLoginInfo(User user);
	List<UserList> findAllUserList();
	
	BaseListRespData<UserList> findAllUserList2();
	
	PageVO<UserList> findUserPage(PageQO pageQO);
	
//	/**
//     * 根据条件分页查询
//     *
//     * @param country
//     * @param page
//     * @param rows
//     * @return
//     */
//    List<User> selectByUser(User user, int page, int rows);
}
