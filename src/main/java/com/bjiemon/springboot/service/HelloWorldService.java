package com.bjiemon.springboot.service;

import com.bjiemon.springboot.mapper.UserMapper;
import com.bjiemon.springboot.model.ActivityDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldService {

    @Autowired
    private UserMapper userMapper;

    public List<ActivityDO> getHello() {
        List<ActivityDO> activityDOS =  userMapper.getTests();
        System.out.println(activityDOS);
        return activityDOS;
    }
}
