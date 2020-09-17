package com.dream.demo.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class Person implements Serializable {
    /**
     * name
     */
    private String name;

    /**
     * age
     */
    private int age;

    /**
     * sign 签名
     */
    private String sign;

}
