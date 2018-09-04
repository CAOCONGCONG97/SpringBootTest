package com.uplooking.springboot.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Info {
    private Integer id;
    private String number;
    private String cost;
    private String type;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date enter_time;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date leave_time;


    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", cost='" + cost + '\'' +
                ", type='" + type + '\'' +
                ", enter_time=" + enter_time +
                ", leave_time=" + leave_time +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getEnter_time() {
        return enter_time;
    }

    public void setEnter_time(Date enter_time) {
        this.enter_time = enter_time;
    }

    public Date getLeave_time() {
        return leave_time;
    }

    public void setLeave_time(Date leave_time) {
        this.leave_time = leave_time;
    }
}







