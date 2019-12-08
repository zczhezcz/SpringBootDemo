package com.sanguo.springboot.redis.controller;

import com.sanguo.springboot.redis.redisDao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    RedisDao redisDao;

    @RequestMapping("/redis")
    public String sayHello() {
        redisDao.setKey("name", "forezp");
        redisDao.setKey("age", "11");
        return redisDao.getValue("name")+"-"+redisDao.getValue("age");
    }
}
