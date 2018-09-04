package com.uplooking.springboot.pojo;

import java.util.List;

public class InfoResponse {
    private Integer code;
    private String msg;
    private Long count;
    private List<Info>data;

    @Override
    public String toString() {
        return "ArticleResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }

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

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Info> getData() {
        return data;
    }

    public void setData(List<Info> data) {
        this.data = data;
    }
}
