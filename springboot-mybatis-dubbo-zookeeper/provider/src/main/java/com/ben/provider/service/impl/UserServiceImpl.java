package com.ben.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.ben.common.domain.User;
import com.ben.common.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserServiceImpl implements IUserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public User findUser() {
        User user = new User(1, "张三");
        logger.info("find user " + JSON.toJSONString(user));
        return user;
    }
}
