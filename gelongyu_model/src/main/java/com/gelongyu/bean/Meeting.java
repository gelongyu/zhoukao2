package com.gelongyu.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Meeting {

    private Integer id;
    private Integer code;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_time;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_time;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date create_time;
    private Integer type;

    public Meeting() {
    }

    public Meeting(Integer id, Integer code, String name, Date start_time, Date end_time, Date create_time, Integer type) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.start_time = start_time;
        this.end_time = end_time;
        this.create_time = create_time;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", create_time=" + create_time +
                ", type=" + type +
                '}';
    }
}
