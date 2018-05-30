package com.goosen.demo2.service;


import org.springframework.stereotype.Service;

import com.goosen.demo2.commons.model.bo.LoginToken;

/**
 * @desc 用户登录TOKEN服务
 *
 * @author zhumaer
 * @since 6/20/2017 3:00 PM
 */
@Service
public interface LoginTokenService {

	/**
	 *
	 * Add login token.
	 *
	 * @param loginToken the login token
	 * @return the login token
	 */
	LoginToken add(LoginToken loginToken);

	/**
	 *
	 * Delete by id.
	 *
	 * @param id the id
	 */
	void deleteById(String id);

	/**
	 *
	 * Get by id login token.
	 *
	 * @param id the id
	 * @return the login token
	 */

	LoginToken getById(String id);

	/**
	 *
	 * Ttl long.
	 *
	 * @param id the id
	 * @return the long
	 */
	long ttl(String id);

}
