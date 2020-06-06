package com.emon.user.service;

import com.emon.user.mapper.UserMapper;
import com.emon.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){
        return  userMapper.selectByPrimaryKey(id);
    }
}
