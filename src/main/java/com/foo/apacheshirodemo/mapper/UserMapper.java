package com.foo.apacheshirodemo.mapper;

import com.foo.apacheshirodemo.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findByUsername(@Param("username") String username);
    
    
}
