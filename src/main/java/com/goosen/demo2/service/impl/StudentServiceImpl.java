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
		return null;
	}

	@Override
	public Student get(Student entity) {
		return null;
	}

	@Override
	public List<Student> findList(Student entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllList(Student entity) {
		return null;
	}

	@Override
	public int insert(Student entity) {
		return 0;
	}

	@Override
	public int update(Student entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Student entity) {
		return 0;
	}
	

}
