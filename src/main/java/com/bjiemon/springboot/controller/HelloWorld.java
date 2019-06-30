package com.bjiemon.springboot.controller;


import com.bjiemon.springboot.model.ActivityDO;
import com.bjiemon.springboot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/test", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public List<ActivityDO> hello(){
        return helloWorldService.getHello();
    }

}
