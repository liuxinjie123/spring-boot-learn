package com.dream.demo.leafid.snowflake.exception;

/**
 * @author 20172462
 */
public class CheckLastTimeException extends RuntimeException {
    private static final long serialVersionUID = -8190739312919956031L;

    public CheckLastTimeException(String msg){
        super(msg);
    }
}
