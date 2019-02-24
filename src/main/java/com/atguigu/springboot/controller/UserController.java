package com.atguigu.springboot.controller;


import com.atguigu.springboot.bean.user_login;
import com.atguigu.springboot.mapper.user_loginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    user_loginMapper user_loginMapper;

    @GetMapping("/login/{id}")
    public user_login getUser_login(@PathVariable("id") Integer id){
        return user_loginMapper.getUserById(id);
    }

    @GetMapping("/login")
    public user_login insertUser (user_login user_login){
        user_loginMapper.insertUser(user_login);
        return user_login;
    }

}
