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
}
