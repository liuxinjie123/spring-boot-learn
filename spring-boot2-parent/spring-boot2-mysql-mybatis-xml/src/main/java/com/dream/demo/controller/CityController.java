package com.dream.demo.controller;

import com.dream.demo.service.CityService;
import com.dream.demo.util.BaseResponse;
import com.dream.demo.vo.CityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping
    public BaseResponse list() {
        List<CityVo> list = cityService.list();
        return BaseResponse.success(list);
    }

    @GetMapping("/{id}")
    public BaseResponse findById(@PathVariable("id") Long id) {
        CityVo obj = cityService.findById(id);
        return BaseResponse.success(obj);
    }
}
