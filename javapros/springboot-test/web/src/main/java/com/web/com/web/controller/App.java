package com.web.com.web.controller;

import com.application1.App01;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class App {

    @RequestMapping("/app01/hello")
    @ResponseBody
    public String app01_hello(){
        return App01.hello();
    }
}
