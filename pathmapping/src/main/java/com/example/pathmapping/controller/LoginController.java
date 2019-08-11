package com.example.pathmapping.controller;

import org.springframework.ui.Model;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
public class LoginController {

    public String login(Model model){
        model.addAttribute("login","login");
        return  "login";
    }
}
