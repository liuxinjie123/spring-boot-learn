package com.dream.oauth2.jwt.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 程序主入口
 */
@SpringBootApplication
public class OAuthJwtResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthJwtResourceApplication.class, args);
	}

}
