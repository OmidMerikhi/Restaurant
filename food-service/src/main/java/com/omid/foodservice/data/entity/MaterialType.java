package com.omid.foodservice.data.entity;

public enum MaterialType {
    KITCHEN(1,"آشپزخانه"),
    FRUIT(2,"میوه"),
    APPETIZER(3,"پیش غذا"),
    BEVERAGE(4,"نوشیدنی"),
    SANITARY(5,"بهداشتی");

    private String lable;
    private int value;
    MaterialType(int value,String lable){
        this.value=value;
        this.lable=lable;
    }

    public String getLable() {
        return lable;
    }

    public int getValue() {
        return value;
    }
}
