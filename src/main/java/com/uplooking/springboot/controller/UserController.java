package com.uplooking.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.uplooking.springboot.mapper.UserMapper;
import com.uplooking.springboot.pojo.Response;
import com.uplooking.springboot.pojo.User;
import com.uplooking.springboot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.nio.cs.US_ASCII;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersService usersService;
    private Response response;


    @RequestMapping("/registerByUser")
    @ResponseBody
    public String registerByUser(HttpServletResponse resp, String uname, String upassword, String uemail) {
        response = new Response();
        User user = new User();
        user.setUname(uname);
        user.setUpassword(upassword);
        user.setUemail(uemail);
        try {
            usersService.register(user);
            response.setCode(0);
            response.setMsg("OK");
        } catch (Exception e) {
            System.out.println("添加用户出现异常.");
            response.setCode(1);
            response.setMsg("ERROR");
        }
        resp.setContentType("application/json;charset=utf-8");
        String jsonString = JSON.toJSONString(response);
        System.out.println(jsonString);
        return jsonString;
    }


    @RequestMapping("/loginByUser")
    @ResponseBody
    public String loginByUser(HttpServletRequest request, HttpServletResponse resp, String uname, String upassword) {
        response = new Response();
        User user = new User();
        user.setUname(uname);
        user.setUpassword(upassword);
        try {
            User u = usersService.login(user);
            if (u != null) {
                response.setCode(0);
                response.setMsg("OK");
                request.getSession().setAttribute("uname",u.getUname());
            } else {
                response.setCode(2);//2用户不存在
                response.setMsg("USER NOT FOUND");
            }
        } catch (Exception e) {
            System.out.println("查询用户出现异常.");
            response.setCode(1);
            response.setMsg("ERROR");

        }
        resp.setContentType("application/json;charset=utf-8");
        String jsonString = JSON.toJSONString(response);
        System.out.println(jsonString);
        return jsonString;
    }
}
