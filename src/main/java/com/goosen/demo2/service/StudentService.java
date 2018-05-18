package com.goosen.demo2.service;

import java.util.List;

import com.goosen.demo2.entity.Student;

public interface StudentService extends CrudService<Student> {
	
	/**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    List<Student> selectByStudent(Student student, int page, int rows);
	
}
