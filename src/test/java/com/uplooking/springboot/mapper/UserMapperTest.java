package com.uplooking.springboot.mapper;


import com.uplooking.springboot.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;



    @Test
    public void testAddUser() {
        User user = new User();
        user.setUname("admin");
        user.setUpassword("123@123'");
        user.setUemail("21321321@qq.com");
        userMapper.addUser(user);
    }
}
