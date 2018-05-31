package com.goosen.demo2.controller;

import com.goosen.demo2.commons.annotations.LoginAuth;
import com.goosen.demo2.commons.annotations.ResponseResult;
import com.goosen.demo2.commons.model.bo.LoginUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @desc  Spring自定参数解析器之《自动注入已登录用户》
 * 
 * @author zhumaer
 * @since 3/5/2018 23:57 PM
 */
@Api(value = "我的账户", description = "我的账户")
@ResponseResult
@RestController
@RequestMapping("myAccount")
public class MyAccountController {

    @ApiOperation("查询我的画像")
    @LoginAuth
    @GetMapping("profile")
    public LoginUser myAccount(@ApiIgnore LoginUser loginUser) {
        return loginUser;
    }

}

