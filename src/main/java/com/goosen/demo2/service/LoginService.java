package com.goosen.demo2.service;

import com.goosen.demo2.commons.model.qo.LoginQO;
import com.goosen.demo2.commons.model.vo.LoginVO;

/**
 * @desc 登录服务
 *
 * @author zhumaer
 * @since 3/3/2018 22:39 PM
 */
public interface LoginService {

    LoginVO login(LoginQO loginQO);

    void logout();
}
