package com.goosen.demo2.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.goosen.demo2.commons.annotations.ResponseResult;
import com.goosen.demo2.commons.model.qo.PageQO;
import com.goosen.demo2.commons.model.vo.PageVO;
import com.goosen.demo2.commons.result.PlatformResult;
import com.goosen.demo2.entity.User;
import com.goosen.demo2.entity.response.BaseAdd;
import com.goosen.demo2.entity.response.GoodsListRespData;
import com.goosen.demo2.service.PersonService;
import com.goosen.demo2.service.UserService;
import com.mysql.fabric.xmlrpc.base.Array;

@ResponseResult
@RestController
@RequestMapping(value="person")
public class PersonController {
	protected Logger log = LoggerFactory.getLogger(getClass());

//	@Autowired
//    private UserService userService;
//	
//	@Autowired
//    private PersonService personService;
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = {"addUser1"})
	public GoodsListRespData addUser1(@Validated @RequestBody User user) {//(CreateGroup.class)
		
		log.info("进来addUser<<<<<<<<<<<<<<<<<<<<");
		
//		int i =2/0;
		
//		String str = null;
//		Assert.notNull(str, "str is not null.");
		
//		String testStr = personService.insertest("哈哈");
//		log.info("testStr:"+testStr);
		
//		personService.updateLoginInfo(user);
		
//		user = personService.selectByKey(user.getId());
		
//		BaseAdd baseAdd = new BaseAdd();
//		baseAdd.setId(user.getId());
		
		List<User> list = new ArrayList<User>();
		User user1 = new User();
		user1.setId("123");
		user1.setNickname("hh");
		list.add(user1);
		User user2 = new User();
		user2.setId("124");
		user2.setNickname("hh2");
		list.add(user2);
		user.setList(list);
		
		GoodsListRespData resp = new GoodsListRespData();
		//resp.setGoodsList(list);
		resp.setHh("hh");
		resp.setIh(10);
		resp.setCreateDate(new Date());
		
		return resp;
	}
	
//	//成功的
//	@RequestMapping(value = {"getList1"})
//    public PageVO<User> getList1(PageQO pageQO) {
//		Page<User> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize(), pageQO.getOrderBy());
//        //userMapper.selectAll();
//		personService.findAllUserList();
//        return PageVO.build(page);
//    }
//	
//	//不分页
////	@RequestMapping(value = {"getList2"})
////    public List<User> getList2() {
////        return personService.findAllUserList();
////    }
//	
////	@RequestMapping(value = {"getList3"})
////	public PageVO<User> getList(PageQO pageQO, User userQO) {
////	    pageQO.setCondition(userQO);
////	    return userService.selectPage(pageQO);
////	}
//
//    //@GetMapping
////	@RequestMapping(value = {"getList"})
////    public PageVO<User> getList(PageQO pageQO, User userQO) {
////        pageQO.setCondition(userQO);
////        return userService.selectPage(pageQO);
////    }
	
}
