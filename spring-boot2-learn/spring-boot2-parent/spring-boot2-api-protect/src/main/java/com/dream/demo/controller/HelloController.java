package com.dream.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.dream.demo.dto.Person;
import com.dream.demo.util.BaseResponse;
import com.dream.demo.util.sign.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.dream.demo.util.ConstantUtils.API_SECRET_KEY;

@RestController
public class HelloController {

	protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/hello")
	public BaseResponse hello() {
		return BaseResponse.success("Hello greetings from spring-boot2-api-protect");
	}

	/**
	 * http://localhost:9090/test?name=minbo&age=100&sign=495FC6F52324AB1460C95A27803E3A4A
	 */
	@GetMapping("/test")
	public BaseResponse test(Person person, HttpServletRequest request) {
		// 1. 还可以在参数中增加一个动态随机字符参数，比如sId，每次请求时，对方都需要动态生成一个十位随机字符，防止sign值一直固化不变
		// 2. 同时，服务器可以校验请求是否重复，比如可以通过redis存储已请求过的rId（可设置过期时间，以免一直存储历史的rId值），防止别人利用固定请求链接刷请求
		// 3. 可以使用公网ip，限制同一个ip访问次数（也可以在nginx层做限制，这个自行网上了解了）

//		// 获取公网ip
//		String sIp = NetworkUtil.getIpAddress(request);
//		System.out.println("sIp=" + sIp);
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", person.getName());
		params.put("age", person.getAge());
		String serverSign = SignUtil.signByMD5(params, API_SECRET_KEY);
		if (serverSign.equals(person.getSign())) {
			return BaseResponse.success("签名通过");
		}
		return BaseResponse.error("非法请求");
	}
}