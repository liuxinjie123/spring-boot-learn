package com.md.demo.rest;

import com.md.demo.service.CityService;
import com.md.demo.util.JsonResult;
import com.md.demo.util.ResultCode;
import com.md.demo.vo.CityVo;
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
    public JsonResult list() {
        List<CityVo> list = this.cityService.list();
        return new JsonResult(ResultCode.SUCCESS, list);
    }

    @GetMapping("/{id}")
    public JsonResult findById(@PathVariable("id") Long id) {
        CityVo obj = this.cityService.findById(id);
        return new JsonResult(ResultCode.SUCCESS, obj);
    }
}
