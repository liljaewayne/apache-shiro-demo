package com.foo.apacheshirodemo.service.impl;

import com.foo.apacheshirodemo.mapper.UserMapper;
import com.foo.apacheshirodemo.model.User;
import com.foo.apacheshirodemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
