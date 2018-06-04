package com.goosen.demo2.service.impl;

import com.goosen.demo2.commons.helper.PasswordHelper;
import com.goosen.demo2.commons.model.po.login.LoginCredential;
import com.goosen.demo2.commons.model.po.login.LoginToken;
import com.goosen.demo2.commons.model.po.login.LoginUser;
import com.goosen.demo2.commons.model.po.user.User;
import com.goosen.demo2.commons.model.request.login.LoginQO;
import com.goosen.demo2.commons.model.response.login.LoginCredentialVO;
import com.goosen.demo2.commons.model.response.login.LoginVO;
import com.goosen.demo2.service.LoginService;
import com.goosen.demo2.service.UserService;
import com.goosen.demo2.commons.enums.CacheKeyEnum;
import com.goosen.demo2.commons.enums.ResultCode;
import com.goosen.demo2.commons.exception.BusinessException;
import com.goosen.demo2.commons.utils.BeanUtil;
import com.goosen.demo2.commons.utils.IpUtil;
import com.goosen.demo2.commons.utils.RequestContextUtil;
import com.goosen.demo2.commons.annotations.EnumValue;
import com.goosen.demo2.commons.constants.HeaderConstants;
//import com.zm.zhuma.user.client.LoginCredentialClient;
//import com.zm.zhuma.user.client.UserClient;
import com.goosen.demo2.helper.LoginTokenHelper;
import com.goosen.demo2.service.LoginTokenService;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @desc 登录服务实现
 *
 * @author zhumaer
 * @since 3/3/2018 22:39 PM
 */
//@Slf4j
@Service
public class LoginServiceImpl implements LoginService {
	
	protected Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private LoginTokenService loginTokenService;
	
	@Autowired
    private UserService userService;

//	@Autowired
//	private LoginCredentialClient loginCredentialClient;

//	@Autowired
//	private UserClient userClient;

	@Override
	public LoginVO login(LoginQO loginQO) {
	    
	    //测试
	    LoginCredential loginCredential2 = new LoginCredential();
	    loginCredential2.setRandomSalt("123");
	    loginCredential2.setAccount("15088132168");
	    String loginCredential2Pwd = PasswordHelper.encodeBySalt(loginQO.getPwd(), loginCredential2.getRandomSalt());
	    loginCredential2.setPwd(loginCredential2Pwd);
	    loginCredential2.setType("CUSTOM");
	    loginCredential2.setUserId("123456789");
	    //Long id = new Long(12345678);
	    loginCredential2.setId("12345678");
	    loginCredential2.setCreateTime(new Date());
	    loginCredential2.setUpdateTime(new Date());
	    List<LoginCredential> loginCredentialList = new ArrayList<LoginCredential>();
	    loginCredentialList.add(loginCredential2);
		
//		List<LoginCredential> loginCredentialList = loginCredentialClient.getLoginCredentialList(loginQO.getAccount(), loginQO.getType());
		if (loginCredentialList.size() == 0) {
			log.info("login account is nonexistent, account:{}", loginQO.getAccount());
			throw new BusinessException(ResultCode.USER_LOGIN_ERROR);
		}

		//验证密码是否正确
		LoginCredential firstLoginCredential = loginCredentialList.get(0);
		if (!firstLoginCredential.getPwd().equals(PasswordHelper.encodeBySalt(loginQO.getPwd(), firstLoginCredential.getRandomSalt()))) {
			log.info("login account' password is error");
			throw new BusinessException(ResultCode.USER_LOGIN_ERROR);
		}
		
		User user = userService.get(firstLoginCredential.getUserId());
//		User user = userClient.getById(firstLoginCredential.getUserId());
		if (user == null) {
			log.info("login user is null");
			throw new BusinessException(ResultCode.USER_LOGIN_ERROR);
		}

		LoginToken loginToken = this.saveLoginToken(user, firstLoginCredential);

		LoginUser loginUser = new LoginUser();
		BeanUtil.copyProperties(user, loginUser);

		LoginCredentialVO  loginCredential = new LoginCredentialVO();
		BeanUtil.copyProperties(firstLoginCredential, loginCredential);

		LoginVO loginVO = new LoginVO();
		loginVO.setToken(loginToken.getId());
		loginVO.setLoginTime(loginToken.getCreateTime());
		loginVO.setIp(loginToken.getIp());
		loginVO.setPlatform(loginToken.getPlatform());
		loginVO.setTtl(loginToken.getTtl());
		loginVO.setUser(loginUser);
		loginVO.setLoginCredential(loginCredential);
		return loginVO;
//		return LoginVO.builder()
//				.token(loginToken.getId())
//				.loginTime(loginToken.getCreateTime())
//				.ip(loginToken.getIp())
//				.platform(loginToken.getPlatform())
//				.ttl(loginToken.getTtl())
//				.user(loginUser)
//				.loginCredential(loginCredential)
//				.build();
	}

	private LoginToken saveLoginToken(User user, LoginCredential loginCredential) {
		Date currentDate = new Date();
		LoginUser loginUser = new LoginUser();
		BeanUtil.copyProperties(user, loginUser);

		HttpServletRequest request = RequestContextUtil.getRequest();
		
		LoginToken loginToken = new LoginToken();
		loginToken.setCreateTime(currentDate);
		loginToken.setIp(IpUtil.getRealIp(request));
		loginToken.setPlatform(request.getHeader(HeaderConstants.CALL_SOURCE));
		loginToken.setTtl(CacheKeyEnum.VALUE_LOGIN_TOKENS.sec().longValue());
		loginToken.setLoginCredential(loginCredential);
		loginToken.setLoginUser(loginUser);
//		LoginToken loginToken = LoginToken.builder()
//				.createTime(currentDate)
//				.ip(IpUtil.getRealIp(request))
//				.platform(request.getHeader(HeaderConstants.CALL_SOURCE))
//				.ttl(CacheKeyEnum.VALUE_LOGIN_TOKENS.sec().longValue())
//				.loginCredential(loginCredential)
//				.loginUser(loginUser)
//				.build();

		loginToken = loginTokenService.add(loginToken);
		LoginTokenHelper.addLoginTokenIdToCookie(loginToken.getId(), CacheKeyEnum.VALUE_LOGIN_TOKENS.sec());
		return loginToken;
	}

	@Override
	public void logout() {
		LoginToken loginToken = LoginTokenHelper.getLoginTokenFromRequest();
		if (loginToken == null) {
			throw new BusinessException(ResultCode.USER_NOT_LOGGED_IN);
		}

		loginTokenService.deleteById(loginToken.getId());
		LoginTokenHelper.delLoginTokenIdFromCookie();
	}
}
