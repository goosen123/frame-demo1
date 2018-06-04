package com.goosen.demo2.commons.utils;

import com.goosen.demo2.commons.enums.ResultCode;
import com.goosen.demo2.commons.exception.BusinessException;
import com.goosen.demo2.commons.model.commons.ParameterInvalidItem;


/**
 * 校验工具类
 * 
 * @author 肖文杰 https://xwjie.github.io/PLMCodeTemplate/
 *
 */
public class CheckUtil {

	public static void check(boolean condition, String fieldName,String message) {
		if (!condition) {
			fail(fieldName,message);
		}
	}

	public static void notEmpty(String str,String fieldName,String message) {
		if (str == null || str.isEmpty()) {
			fail(fieldName,message);
		}
	}

	public static void notNull(Object obj, String fieldName,String message) {
		if (obj == null) {
			fail(fieldName,message);
		}
	}

	private static void fail(String fieldName, String message) {
		throw new BusinessException(ResultCode.PARAM_IS_INVALID,new ParameterInvalidItem(fieldName,message));
	}
}
