package com.md.demo.controller;

import javax.annotation.Resource;

import com.md.demo.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.md.demo.util.JsonResult;
import com.md.demo.util.ResultCode;
import com.md.demo.vo.Person;

import java.util.List;

@RestController
public class ObjectRedisController {
	protected static Logger logger = LoggerFactory.getLogger(ObjectRedisController.class);

	@Resource
	private RedisUtil redisUtil;

    /**
     * set object
     */
	@GetMapping("/setObj")
	public JsonResult setObjToRedis(@RequestBody Person person) {
		logger.debug("访问set：" + person.toString());
		redisUtil.set("person:" + person.getId(), person);
		return new JsonResult(ResultCode.SUCCESS);
	}

    /**
     * get object
     */
	@GetMapping("/getObj/{id}")
	public JsonResult getObj(@PathVariable("id") String id) {
		logger.debug("访问get:key id={}", id);
		Person person = (Person) redisUtil.get("person:" + id);
		String result = person.toString();
		logger.debug("get obj result=" + result);
		return new JsonResult(ResultCode.SUCCESS, person);
	}

    /**
     * set list
     */
    @GetMapping("/setList")
    public JsonResult setObjectList(@RequestBody List<Person> personList) {
        logger.debug("访问set：" + personList.toString());
        redisUtil.set("personList:", personList);
        return new JsonResult(ResultCode.SUCCESS);
    }

    /**
     * get list
     */
    @GetMapping("/getList")
    public JsonResult getObjectList() {
        List<Person> personList = (List<Person>) redisUtil.get("personList:");
        logger.info(" get personList:" + personList);
        return new JsonResult(ResultCode.SUCCESS, personList);
    }
}