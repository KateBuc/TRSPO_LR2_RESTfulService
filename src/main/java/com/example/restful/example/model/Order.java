package com.example.restful.example.model;


import java.util.HashMap;
import java.util.Map;

public class Order {

    private Integer id;
    private String cardNumber;
    private String adress;
    private Map<Integer, Item> ORDER_ITEMS_MAP = new HashMap<>();

    public Order(String cardNumber, String adress) {
        super();
        this.cardNumber = cardNumber;
        this.adress = adress;
    }

    public Map<Integer, Item> getORDER_ITEMS_MAP() {
        return ORDER_ITEMS_MAP;
    }

    public void setORDER_ITEMS_MAP(Map<Integer, Item> ORDER_ITEMS_MAP) {
        this.ORDER_ITEMS_MAP = ORDER_ITEMS_MAP;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
