package com.md.demo.controller;

import com.md.demo.util.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public BaseResponse hello() {
        return BaseResponse.success("Hello greetings from spring-boot2-mysql-druid");
    }
}
