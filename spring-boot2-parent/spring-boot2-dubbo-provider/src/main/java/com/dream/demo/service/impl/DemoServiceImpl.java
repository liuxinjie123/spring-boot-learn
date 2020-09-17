package com.dream.demo.service.impl;

import com.dream.demo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Welcome to Minbo's Dubbo demo, Hello " + name;
	}

}
