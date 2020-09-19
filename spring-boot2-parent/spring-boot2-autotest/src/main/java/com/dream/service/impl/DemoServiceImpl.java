package com.dream.service.impl;

import com.dream.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello() {
		return "hello from service layer";
	}
	
}
