package com.goosen.demo2.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






//import com.zm.zhuma.user.token.service.LoginTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.goosen.demo2.commons.annotations.LoginAuth;
import com.goosen.demo2.commons.enums.ResultCode;
import com.goosen.demo2.commons.exception.BusinessException;
import com.goosen.demo2.commons.model.po.login.LoginToken;
import com.goosen.demo2.commons.model.po.login.LoginUser;
import com.goosen.demo2.commons.utils.StringUtil;
import com.goosen.demo2.helper.LoginTokenHelper;
import com.goosen.demo2.service.LoginTokenService;

/**
 * 已登录权限验证拦截器 备注：通过{@link LoginAuth}配合使用
 * @author Goosen
 * @since 2018-05-31 pm
 */
public class LoginAuthInterceptor implements HandlerInterceptor {

	@Autowired
	private LoginTokenService loginTokenService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (handler instanceof HandlerMethod) {
			final HandlerMethod handlerMethod = (HandlerMethod) handler;
			final Class<?> clazz = handlerMethod.getBeanType();
			final Method method = handlerMethod.getMethod();

			if (clazz.isAnnotationPresent(LoginAuth.class) || method.isAnnotationPresent(LoginAuth.class)) {

				//直接获取登录用户（防止请求转发时，第二次查询）
				LoginUser loginUser = LoginTokenHelper.getLoginUserFromRequest();
				if (loginUser != null) {
					return true;
				}

				//获取登录TOKEN ID
				String loginTokenId = LoginTokenHelper.getLoginTokenId();
				if (StringUtil.isEmpty(loginTokenId)) {
					throw new BusinessException(ResultCode.USER_NOT_LOGGED_IN);
				}

				//获取登录TOKEN信息
				LoginToken loginToken = loginTokenService.getById(loginTokenId);
				if (loginToken == null) {
					throw new BusinessException(ResultCode.USER_NOT_LOGGED_IN);
				}

				//登录TOKEN信息放入请求对象，方便后续controller中获取
				LoginTokenHelper.addLoginTokenToRequest(loginToken);
				return true;
			}
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// nothing to do
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		// nothing to do
	}

}
