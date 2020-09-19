package com.dream.oauth2.resource.controller;

import com.dream.util.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public BaseResponse productList() {
        return BaseResponse.success();
    }
}
