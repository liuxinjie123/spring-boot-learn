package com.dream.oauth2.jwt.resource.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

@ConfigurationProperties("security")
@Data
public class SecurityProperties {

    private JwtProperties jwt;

    @Data
    public static class JwtProperties {
        private Resource publicKey;

    }

}
