package com.goosen.demo2.service;

import java.util.List;

import com.goosen.demo2.commons.model.po.user.User;
import com.goosen.demo2.commons.model.request.BasePageReqData;
import com.goosen.demo2.commons.model.response.BaseListRespData;
import com.goosen.demo2.commons.model.response.BasePageRespData;
import com.goosen.demo2.commons.model.response.user.UserList1;

public interface PersonService{
	String insertest(String testStr);
	int updateLoginInfo(User user);
	List<UserList1> findAllUserList();
	
	BaseListRespData<UserList1> findAllUserList2();
	
	BasePageRespData<UserList1> findUserPage(BasePageReqData pageQO);
	
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
