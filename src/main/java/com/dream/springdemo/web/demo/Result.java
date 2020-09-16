package com.dream.springdemo.web.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Result implements Serializable {
    public String code;
    public String msg;

    public static final String SUCCESS_CODE = "000000";
    public static final String SUCCESS_MSG = "OK";

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result success() {
        return new Result(SUCCESS_CODE, SUCCESS_MSG);
    }

    public static Result success(String code, String msg) {
        return new Result(code, msg);
    }
}
