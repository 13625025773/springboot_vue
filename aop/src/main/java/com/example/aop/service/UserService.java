package com.example.aop.service;

import org.springframework.stereotype.Service;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@Service
public class UserService {

    public String getUserById(Integer id){
        System.out.println("get ... ");
        return "user";
    }

    public void deleteUserById(Integer id){
        System.out.println("delete ....");
    }
}
