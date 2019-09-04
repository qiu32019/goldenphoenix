package com.glodphoenix.starter.mysql.exception;

/**
 * 自定义DB异常 gold phoenix db exception
 */
public class GPDBException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public GPDBException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public GPDBException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public GPDBException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public GPDBException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
