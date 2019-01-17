package com.tan.controller;

import com.tan.dao.UserInfoMapper;
import com.tan.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserInfoMapper userInfoMapper;

    @RequestMapping(value = "/user/{userid}")
    public UserInfo findUser(@PathVariable Integer userid){
        return userInfoMapper.selectByPrimaryKey(userid);
    }


}
