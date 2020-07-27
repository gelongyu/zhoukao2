package com.gelongyu.bean;

public class Meeting_type {

    private Integer id;
    private String name;

    public Meeting_type() {
    }

    public Meeting_type(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Meeting_type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
