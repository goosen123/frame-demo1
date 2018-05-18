package com.goosen.demo2.controller;

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
import com.goosen.demo2.entity.User;
import com.goosen.demo2.service.PersonService;
import com.goosen.demo2.service.UserService;

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
//	
//	@ResponseStatus(HttpStatus.CREATED)
//	@RequestMapping(value = {"addUser1"})
//	public User addUser1(@Validated @RequestBody User user) {//(CreateGroup.class)
//		
//		log.info("进来addUser<<<<<<<<<<<<<<<<<<<<");
//		
////		int i =2/0;
//		
////		String str = null;
////		Assert.notNull(str, "str is not null.");
//		
////		String testStr = personService.insertest("哈哈");
////		log.info("testStr:"+testStr);
//		
//		personService.updateLoginInfo(user);
//		
////		user = personService.selectByKey(user.getId());
//		
//		return user;
//	}
//	
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
