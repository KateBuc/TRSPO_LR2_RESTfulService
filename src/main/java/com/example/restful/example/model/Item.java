package com.example.restful.example.model;

public class Item {
    private Integer id;
    private String name;
    private int amount;
    private double weightKG;
    private boolean fragile;

    public Item(String name, int amount, double weightKG, boolean fragile) {
        super();
        this.name = name;
        this.amount = amount;
        this.weightKG = weightKG;
        this.fragile = fragile;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }
}
