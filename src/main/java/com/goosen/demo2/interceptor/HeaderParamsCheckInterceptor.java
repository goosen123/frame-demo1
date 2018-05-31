package com.goosen.demo2.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.goosen.demo2.commons.constants.HeaderConstants;
import com.goosen.demo2.commons.enums.CallSourceEnum;
import com.goosen.demo2.commons.enums.ResultCode;
import com.goosen.demo2.commons.exception.BusinessException;
import com.goosen.demo2.commons.utils.StringUtil;

/**
 * HEADER头参数校验
 * @author Goosen
 * @since 2018-05-31 pm
 */
public class HeaderParamsCheckInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (handler instanceof HandlerMethod) {
			String callSource = request.getHeader(HeaderConstants.CALL_SOURCE);
			String apiVersion = request.getHeader(HeaderConstants.API_VERSION);
			String appVersion = request.getHeader(HeaderConstants.APP_VERSION);

			if (StringUtil.isAnyBlank(callSource, apiVersion)) {
				throw new BusinessException(ResultCode.PARAM_NOT_COMPLETE);
			}

			try {
				Double.valueOf(apiVersion);
			} catch (NumberFormatException e) {
				throw new BusinessException(ResultCode.PARAM_IS_INVALID);
			}

			if ((CallSourceEnum.ANDROID.name().equals(callSource) || CallSourceEnum.IOS.name().equals(callSource)) && StringUtil.isEmpty(appVersion)) {
				throw new BusinessException(ResultCode.PARAM_NOT_COMPLETE);
			}

			if (!CallSourceEnum.isValid(callSource)) {
				throw new BusinessException(ResultCode.PARAM_IS_INVALID);
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
