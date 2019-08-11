package com.example.json.controller;

import com.example.json.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@RestController
public class BookController {

    @GetMapping("/book")
    public Book book(){
        Book book=new Book();
        book.setAuthor("JSON");
        book.setName("主流的前后端数据传输方式");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }
}
