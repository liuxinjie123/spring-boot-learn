package com.dream.oauth2.resource.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class UseRole implements Serializable {
    private Long id;
    /**
     * user id
     */
    private Long uid;

    /**
     * role id
     */
    private Long rid;
    private LocalDateTime createTime;
}
