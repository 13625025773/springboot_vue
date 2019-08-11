package com.example.properties.controller;

import com.example.properties.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@RestController
public class StudentController {

    @Resource
    Student student;

    @GetMapping("/student")
    public  Student student(){
        return this.student;
    }

}
