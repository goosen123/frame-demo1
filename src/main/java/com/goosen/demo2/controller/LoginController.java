package com.goosen.demo2.controller;

import com.goosen.demo2.commons.annotations.ResponseResult;
import com.goosen.demo2.commons.model.qo.LoginQO;
import com.goosen.demo2.commons.model.vo.LoginVO;
import com.goosen.demo2.service.LoginService;
import com.goosen.demo2.commons.annotations.LoginAuth;
//import com.zm.zhuma.commons.web.annotations.ResponseResult;
//import com.zm.zhuma.commons.web.constants.Constants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhumaer
 * @description : 登陆接口
 * @date : 2017/11/9 14点58分
 */
@Api(value = "登陆管理" , description = "登陆/登出")
//@Slf4j
@ResponseResult
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation(value = "员工登陆", notes = "员工登陆使用登陆账号和密码进行登陆")
    @RequestMapping(value = {"login"},method=RequestMethod.POST)
    public LoginVO login(@RequestBody @Validated LoginQO loginQO){
        LoginVO loginVO = loginService.login(loginQO);
        return loginVO;
    }


    @ApiOperation(value = "退出登陆")
    @LoginAuth
    @RequestMapping(value = {"logout"},method=RequestMethod.POST)
    public void logout(){
        loginService.logout();
    }

}
