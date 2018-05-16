package com.goosen.demo2.dao;

import com.goosen.demo2.commons.annotations.MyBatisDao;



/**
 * @desc 基础增删改查功能mapper
 * 
 * @author zhumaer
 * @since 10/18/2017 18:31 PM
 */
@MyBatisDao
public interface CrudMapper<T> extends
		InsertMapper<T>,
		DeleteMapper<T>,
		UpdateMapper<T>,
		SelectMapper<T> {
}
