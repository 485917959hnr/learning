package com.bjiemon.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String getHello() {
        return "hello";
    }
}
