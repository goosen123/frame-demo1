package com.goosen.demo2.commons.exception;

/**
 * 用户未登录异常
 * @author Goosen
 * @since 2018-05-31 pm
 */
public class UserNotLoginException extends BusinessException {

	private static final long serialVersionUID = -1879503946782379204L;

	public UserNotLoginException() {
		super();
	}

	public UserNotLoginException(String msg) {
		super(msg);
	}

	public UserNotLoginException(String formatMsg, Object... objects) {
		super(formatMsg, objects);
	}

}
