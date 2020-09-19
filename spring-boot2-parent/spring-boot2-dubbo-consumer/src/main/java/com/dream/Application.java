package com.dream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 程序主入口
 * @author 20172462
 */
@SpringBootApplication
//使用 consumers.xml 配置；
@ImportResource(value = { "classpath:consumers.xml" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
