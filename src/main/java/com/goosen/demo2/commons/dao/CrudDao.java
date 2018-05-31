/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.goosen.demo2.commons.dao;

import com.goosen.demo2.commons.annotations.MyBatisDao;

/**
 * DAO支持类实现
 * @author ThinkGem
 * @version 2014-05-16
 * @param <T>
 */
@MyBatisDao
public interface CrudDao<T> extends BaseDao {

	public T get(String id);
	public int insert(T entity);
	public int update(T entity);
	public int delete(String id);
	
}