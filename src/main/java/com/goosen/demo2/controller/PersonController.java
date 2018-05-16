package com.goosen.demo2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.util.Assert;

import com.goosen.demo2.commons.annotations.ResponseResult;
import com.goosen.demo2.commons.model.qo.PageQO;
import com.goosen.demo2.commons.model.vo.PageVO;
import com.goosen.demo2.commons.validator.CreateGroup;
import com.goosen.demo2.dao.UserMapper;
import com.goosen.demo2.entity.User;
import com.goosen.demo2.service.PersonService;
import com.goosen.demo2.service.UserService;

@ResponseResult
@RestController
@RequestMapping(value="person")
public class PersonController {
	protected Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
    private UserService userService;
	
//	@Autowired
//    private UserMapper userMapper;
	
	@Autowired
    private PersonService personService;
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = {"addUser1"})
	public User addUser1(@Validated @RequestBody User user) {//(CreateGroup.class)
		
		log.info("进来addUser<<<<<<<<<<<<<<<<<<<<");
		
//		int i =2/0;
		
//		String str = null;
//		Assert.notNull(str, "str is not null.");
		
//		String testStr = personService.insertest("哈哈");
//		log.info("testStr:"+testStr);
		
		personService.updateLoginInfo(user);
		
		return user;
	}
	
	//@PostMapping
	@RequestMapping(value = {"addUser"})
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@Validated @RequestBody User user) {
        String userId = userService.insert(user);
//        if (userId != null) {
//            return userService.selectByPk(userId);
//        }
//        return null;
        return user;
    }
	
	@RequestMapping(value = {"updateUser"})
    @ResponseStatus(HttpStatus.CREATED)
    public User updateUser(@Validated @RequestBody User user) {
		String userId = user.getId();
        userService.updateByPk(userId, user);
//        if (userId != null) {
//            return userService.selectByPk(userId);
//        }
//        return null;
        return user;
    }

    //@GetMapping
//	@RequestMapping(value = {"getList"})
//    public PageVO<User> getList(PageQO pageQO, User userQO) {
//        pageQO.setCondition(userQO);
//        return userService.selectPage(pageQO);
//    }
	
}
