package com.example.aop.controller;

import com.example.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserById")
    public String getUserById(Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/deleteUserById")
    public void deleteUserById(Integer id){
         userService.deleteUserById(id);
    }
}
