package com.uplooking.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/articleList")
    public String articleList() {
        return "articleList";
    }
    @RequestMapping("/about")
    public String sbout() {
        return "about";
    }

    @RequestMapping("/message")
    public String message() {
        return "message";
    }
    @RequestMapping("/add")
    public String add() {
        return "add";
    }
    @RequestMapping("/black_name")
    public String black_name() {
        return "black_name";
    }
}
