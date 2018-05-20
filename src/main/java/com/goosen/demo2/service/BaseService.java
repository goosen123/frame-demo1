/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.goosen.demo2.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Service基类
 * @author ThinkGem
 * @version 2014-05-16
 */
@Transactional(readOnly = true)
public interface BaseService {
	
}
