package com.uplooking.springboot.pojo;

import java.io.Serializable;

public class Response implements Serializable {
    private Integer code;//返回0则代表成功,非0代表失败
    private String msg;//具体的响应信息

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
