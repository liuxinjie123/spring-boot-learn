package com.dream.demo.service.impl;

import org.springframework.stereotype.Service;

import com.dream.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	public String sayHello() {
		return "hello from service layer";
	}
	
}