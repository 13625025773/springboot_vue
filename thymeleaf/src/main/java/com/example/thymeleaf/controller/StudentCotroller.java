package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@Controller
public class StudentCotroller {

    @GetMapping("/students")
    public String students(Model model){
        Student student1=new Student(1,"韩雪","女",18);
        Student student2=new Student(1,"刘亦菲","女",22);
        Student student3=new Student(1,"鞠婧祎","女",16);
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        model.addAttribute("students",studentList);
        return "students";
    }
}
