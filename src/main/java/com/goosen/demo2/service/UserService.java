package com.goosen.demo2.service;

import org.springframework.stereotype.Service;

import com.goosen.demo2.service.CrudService;
import com.goosen.demo2.entity.User;

public interface UserService extends CrudService<User, String> {

}
