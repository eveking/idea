package com.example.controller;

import com.example.bean.BookBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private BookBean bookBean;

    @RequestMapping(value = "/index",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String toIndex(){
        return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book price is "+bookBean.getPrice();
    }
}
