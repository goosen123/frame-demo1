package com.goosen.demo2.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.goosen.demo2.entity.Student;
import com.goosen.demo2.service.StudentService;

@Service("StudentService")
public class StudentServiceImpl extends CrudServiceImpl<Student> implements StudentService{

	@Override
	public List<Student> selectByStudent(Student student, int page, int rows) {
		return null;
	}

	

}
