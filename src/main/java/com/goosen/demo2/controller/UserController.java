package com.goosen.demo2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户Controller
 * @author Goosen
 * @version 2018-05-08
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {
	
	protected Logger log = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = {"list"})
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		log.info("进来了<<<<<<<<<<<<<<<<<<<<");
		
//		return;
		return "modules/test/success";
	}
	
}
