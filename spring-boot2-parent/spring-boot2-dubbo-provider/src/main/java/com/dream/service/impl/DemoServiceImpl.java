package com.dream.service.impl;

import com.dream.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Welcome to Minbo's Dubbo demo, Hello " + name;
	}

}
