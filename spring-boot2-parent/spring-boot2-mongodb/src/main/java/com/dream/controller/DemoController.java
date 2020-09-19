package com.dream.controller;

import com.alibaba.fastjson.JSON;
import com.dream.service.DemoService;
import com.dream.util.BaseResponse;
import com.dream.vo.DemoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/demo")
@RestController
public class DemoController {
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService demoService;

    /**
     * 新增
     */
    @PostMapping
    public BaseResponse saveDemoTest() {
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("使用mongodb");
        demoEntity.setDescription("description");
        demoEntity.setBy("hello");
        demoEntity.setUrl("http://baidu.com");

        this.demoService.add(demoEntity);

        demoEntity = new DemoEntity();
        demoEntity.setId(2L);
        demoEntity.setTitle("使用mongodb2");
        demoEntity.setDescription("description-2");
        demoEntity.setBy("miracle");
        demoEntity.setUrl("http://www.jd.com");

        this.demoService.add(demoEntity);
        logger.info(JSON.toJSONString(demoEntity));
        return BaseResponse.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/{id}")
    public BaseResponse removeDemoTest(Long id) {
        this.demoService.removeDemo(id);
        return BaseResponse.success();
    }

    /**
     * 修改
     */
    @PutMapping
    public BaseResponse updateDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("使用mongodb3");
        demoEntity.setDescription("这是描述3");
        demoEntity.setBy("minbo3");
        demoEntity.setUrl("https://blog.csdn.net/hemin1003");

        this.demoService.modifyDemo(demoEntity);

        return BaseResponse.success(demoEntity);
    }

    /**
     * 查找
     */
    @GetMapping("/{id}")
    public BaseResponse findById(Long id) {
        DemoEntity demoEntity = this.demoService.findById(id);
        System.out.println(demoEntity.toString());
        return BaseResponse.success(demoEntity);
    }
}
