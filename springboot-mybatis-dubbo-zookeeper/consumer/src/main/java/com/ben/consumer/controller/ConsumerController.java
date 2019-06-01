package com.ben.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ben.common.domain.User;
import com.ben.common.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Reference
    private IUserService iUserService;

    @RequestMapping("/findUser")
    public User findUser(){
        return iUserService.findUser();
    }
}
