package com.goosen.demo2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.goosen.demo2.commons.annotations.ResponseResult;
import com.goosen.demo2.commons.result.PlatformResult;
import com.goosen.demo2.commons.validator.CreateGroup;
import com.goosen.demo2.entity.User;

@ResponseResult
@RestController
@RequestMapping(value="person")
public class PersonController {
	protected Logger log = LoggerFactory.getLogger(getClass());

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = {"addUser"})
	public User addUser(@Validated(CreateGroup.class) @RequestBody User user) {
		
		log.info("进来addUser<<<<<<<<<<<<<<<<<<<<");
		
//		int i =2/0;
		
		return user;
	}
}
