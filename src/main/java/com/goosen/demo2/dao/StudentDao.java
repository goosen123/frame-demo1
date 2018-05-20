package com.goosen.demo2.dao;

import com.goosen.demo2.commons.annotations.MyBatisDao;
import com.goosen.demo2.entity.Student;


@MyBatisDao
public interface StudentDao extends CrudDao<Student>{
	
}
