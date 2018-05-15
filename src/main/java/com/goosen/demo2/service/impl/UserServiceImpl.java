package com.goosen.demo2.service.impl;

import com.goosen.demo2.service.UserService;
import com.goosen.demo2.service.impl.BaseMySqlCrudServiceImpl;
import com.goosen.demo2.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseMySqlCrudServiceImpl<User, String> implements UserService {

}
