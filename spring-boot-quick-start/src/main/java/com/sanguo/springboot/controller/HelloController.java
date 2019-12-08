package com.sanguo.springboot.controller;

import com.sanguo.springboot.entity.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping("/login")
    public BaseResponse login(String stationId) {
        return new BaseResponse(true,101,stationId);
    }
}
