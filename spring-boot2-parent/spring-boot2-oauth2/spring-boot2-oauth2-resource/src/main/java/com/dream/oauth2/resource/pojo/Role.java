package com.dream.oauth2.resource.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Role implements GrantedAuthority {
    private Long id;
    private String roleName;
    private String roleDesc;
    private LocalDateTime createTime;

    @Override
    public String getAuthority() {
        return null;
    }
}
