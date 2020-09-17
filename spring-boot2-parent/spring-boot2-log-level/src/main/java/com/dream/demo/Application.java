package com.dream.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;

/**
 * 程序主入口
 */
@SpringBootApplication
@EnableSwaggerBootstrapUI
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
