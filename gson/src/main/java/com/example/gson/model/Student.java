package com.example.gson.model;

import java.util.Date;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
public class Student {
    protected Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Date date;

    public Student() {
    }

    public Student(Integer id, String name, String sex, Integer age, Date date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
