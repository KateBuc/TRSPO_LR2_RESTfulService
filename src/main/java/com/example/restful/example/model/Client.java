package com.example.restful.example.model;

import java.util.HashMap;
import java.util.Map;

public class Client {


    private Integer id;
    private String name;
    private String email;
    private String phone;
    private Map<Integer, Order> CLIENT_ORDER_MAP = new HashMap<>();

    public Map<Integer, Order> getCLIENT_ORDER_MAP() {
        return CLIENT_ORDER_MAP;
    }

    public void setCLIENT_ORDER_MAP(Map<Integer, Order> CLIENT_ORDER_MAP) {
        this.CLIENT_ORDER_MAP = CLIENT_ORDER_MAP;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}