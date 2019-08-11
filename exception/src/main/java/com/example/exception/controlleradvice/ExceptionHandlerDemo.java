package com.example.exception.controlleradvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@ControllerAdvice
public class ExceptionHandlerDemo {
    @ExceptionHandler(Exception.class)
    public void exception(Exception e, HttpServletResponse resp) throws Exception{
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        out.write("小主人,出错了!");
        out.flush();
        out.close();
    }
}
