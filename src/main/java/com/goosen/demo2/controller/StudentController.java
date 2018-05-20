package com.goosen.demo2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goosen.demo2.commons.annotations.ResponseResult;
import com.goosen.demo2.entity.Student;
import com.goosen.demo2.service.StudentService;

@ResponseResult
@RestController
@RequestMapping(value="student")
public class StudentController {
	protected Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
    private StudentService studentService;
	
	@RequestMapping(value = {"getStudent"})
	public Student getStudent() {
		log.info("进来的student的getStudent了");
    	Student student = null;//studentService.selectByKey("123456");
    	return student;
	}
	
}
