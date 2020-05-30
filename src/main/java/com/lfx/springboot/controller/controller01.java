package com.lfx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller01 {

    @ResponseBody
    @RequestMapping("/")
    public String   index(){
        return "123";
    }
    @ResponseBody
    @RequestMapping("/")
    public String   test01(){
        System.out.println("版本01");
        System.out.println("版本02");
        System.out.println("创建分支dev");
        System.out.println("主干改变");
        return "123";
    }
}
