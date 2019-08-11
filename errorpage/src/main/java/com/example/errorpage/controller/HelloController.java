package com.example.errorpage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        int i=1/0;
        return "index";
    }
}
