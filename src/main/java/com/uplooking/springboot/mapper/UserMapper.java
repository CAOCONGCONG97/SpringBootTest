package com.uplooking.springboot.mapper;

import com.uplooking.springboot.pojo.Response;
import com.uplooking.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    void addUser(User user);
    User findUser(User user);
}
