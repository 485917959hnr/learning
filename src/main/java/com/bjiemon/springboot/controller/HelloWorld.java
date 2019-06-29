package com.bjiemon.springboot.controller;


import com.bjiemon.springboot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorld {

    @Autowired
    private HelloWorldService helloWorldService;

    @ResponseBody
    @RequestMapping(value = "/test", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public String hello(){
        return helloWorldService.getHello();
    }

}
