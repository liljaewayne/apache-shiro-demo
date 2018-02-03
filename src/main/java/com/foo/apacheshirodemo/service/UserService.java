package com.foo.apacheshirodemo.service;

import com.foo.apacheshirodemo.model.User;

public interface UserService {
    User findByUsername(String username);
    
}
