package com.dream.exception;

public class NotLoginException extends RuntimeException {
    private String msg;
    public NotLoginException(){}

    public NotLoginException(String msg) {
        this.msg = msg;
    }
}
