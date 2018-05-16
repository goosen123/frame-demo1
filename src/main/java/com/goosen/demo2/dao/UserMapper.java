package com.goosen.demo2.dao;

import org.springframework.stereotype.Repository;

import com.goosen.demo2.entity.User;

/**
 * @desc 用户Mapper
 *
 * @author zhumaer
 * @since 25/1/2018 22:39 PM
 */
@Repository
public interface UserMapper extends CrudMapper<User> {
}
