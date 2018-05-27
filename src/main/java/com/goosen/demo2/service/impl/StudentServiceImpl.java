package com.goosen.demo2.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.goosen.demo2.dao.StudentDao;
import com.goosen.demo2.entity.Student;
import com.goosen.demo2.service.StudentService;

@Service("StudentService")
public class StudentServiceImpl implements StudentService{

	
	private StudentDao studentDao;

	@Override
	public Student get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Student entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Student entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
