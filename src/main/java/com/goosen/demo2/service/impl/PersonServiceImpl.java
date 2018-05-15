package com.goosen.demo2.service.impl;

import org.springframework.stereotype.Service;

import com.goosen.demo2.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Override
	public String insertest(String testStr) {
		return testStr;
	}

}
