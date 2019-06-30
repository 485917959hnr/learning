package com.bjiemon.springboot.mapper;

import com.bjiemon.springboot.model.ActivityDO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    @Select("SELECT * FROM test")
    List<ActivityDO> getTests();

}