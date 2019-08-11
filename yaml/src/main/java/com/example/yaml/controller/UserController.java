package com.example.yaml.controller;

import com.example.yaml.model.User;
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
    private User user;

    @GetMapping("/user")
    public User user(){
        return this.user;
    }
}
