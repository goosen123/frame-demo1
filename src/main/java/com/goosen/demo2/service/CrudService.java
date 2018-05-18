package com.goosen.demo2.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CrudService<T> {
	
	T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

    //TODO 其他...
}
