package com.goosen.demo2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goosen.demo2.entity.User;

@RestController
@RequestMapping(value="person")
public class PersonController {
	protected Logger log = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = {"addUser"})
	public User addUser(@RequestBody User user) {
		
		log.info("进来addUser<<<<<<<<<<<<<<<<<<<<");
		
		return user;
	}
}
