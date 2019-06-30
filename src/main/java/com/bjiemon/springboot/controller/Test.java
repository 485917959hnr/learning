package com.bjiemon.springboot.controller;

import com.bjiemon.springboot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Test {
    @Autowired
    private HelloWorldService helloWorldService;
    @RequestMapping(value = "/test", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.DELETE)
    public void hello() {
        helloWorldService.delete();
    }
}
