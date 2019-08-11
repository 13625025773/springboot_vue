package com.example.gson.controller;

import com.example.gson.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@RestController
public class StudentController {

    @GetMapping("/student-gson")
    public List<Student>  students(){
        Student student1=new Student(1,"韩雪","女",23,new Date());
        Student student2=new Student(1,"鞠婧祎","女",16,new Date());
        Student student3=new Student(1,"杨紫","女",19,new Date());
        Student student4=new Student(1,"周冬雨","女",16,new Date());
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        return studentList;
    }
}
