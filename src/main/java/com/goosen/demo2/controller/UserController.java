package com.goosen.demo2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.goosen.demo2.commons.annotations.ResponseResult;
import com.goosen.demo2.commons.utils.CheckUtil;
import com.goosen.demo2.commons.utils.RequestContextUtil;
import com.goosen.demo2.entity.request.UserCommitReqData;
import com.goosen.demo2.entity.response.BaseCudRespData;

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
	
	
	@ResponseResult
	@ResponseBody
	@RequestMapping(value = {"addUser2"})
	public BaseCudRespData<String> addUser2(@Validated @RequestBody UserCommitReqData user) {//(CreateGroup.class)
		
		log.info("进来addUser2<<<<<<<<<<<<<<<<<<<<");
		
		BaseCudRespData<String> baseIdRespData = new BaseCudRespData<String>();
		baseIdRespData.setId("123456");
		
		return baseIdRespData;
	}
	
	
	@RequestMapping(value = {"save"})
	public String save(@Validated UserCommitReqData user) {//,HttpServletRequest request
		
		HttpServletRequest request = RequestContextUtil.getRequest();
		
		log.info("进来save<<<<<<<<<<<<<<<<<<<<");
		log.info("user："+user);
		log.info("request的nickname："+request.getParameter("nickname"));
		
		//跳转的要不要校验？？
		//Assert.notNull(user.getActionType(), "str is not null.");
		//CheckUtil.notEmpty(user.getActionType(),"actionType","不能空");
		//int i=1/0;
		
		return "modules/test/success";
	}
	
	
	
}
