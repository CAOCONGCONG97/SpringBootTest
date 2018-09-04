package com.uplooking.springboot.service;

import com.uplooking.springboot.mapper.UserMapper;
import com.uplooking.springboot.pojo.Response;
import com.uplooking.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UserMapper userMapper;

    public void register(User user) {
        userMapper.addUser(user);
    }

    public User login(User user) {
        return userMapper.findUser(user);
    }

}
