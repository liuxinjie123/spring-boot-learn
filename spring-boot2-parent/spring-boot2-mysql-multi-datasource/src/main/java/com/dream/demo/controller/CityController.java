package com.dream.demo.controller;

import com.dream.demo.service.CityService;
import com.dream.demo.util.BaseResponse;
import com.dream.demo.vo.CityVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    protected static Logger logger = LoggerFactory.getLogger(CityController.class);

    @Autowired
    private CityService cityService;


    @GetMapping("/1")
    public BaseResponse cityList1() {
        List<CityVo> list = cityService.list1();
        return BaseResponse.success(list);
    }

    /**
     * http://localhost:9090/listCities222
     *
     * @return
     */
    @GetMapping("/2")
    public BaseResponse cityList2() {
        List<CityVo> list = cityService.list2();
        return BaseResponse.success(list);
    }
}
