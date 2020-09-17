package com.dream.demo.pay.test;

import com.dream.demo.pay.utils.variation.PayServiceUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 本地测试类
 */
@Service
public class WechatPayServiceTest {

	protected static Logger logger = LoggerFactory.getLogger(WechatPayServiceTest.class);

	// 测试
	public static void main(String[] args) {

		// 订单查询
//		wechat.doEquery("996846M20180330115059R5X9H9MHM", null);

		// 支付打款
		PayServiceUtils.doEpay("wx3ff92cec62c097d1", "o7Hzn0rr6U3Xb7Q1W9M-bH7SQXys", "192.168.1.1", "100",
				"996846M20180330115059R5X9H9MHY", null, null, null, "xxx的红包");

		System.out.println("done");
	}

}