package com.omid.foodservice.data.entity;

public enum FoodType {
    IRANI(1,"ایرانی"),
    BEVERAGE(2,"نوشیدنی"),
    APPETIZER(3,"پیش غذا");
    int value;
    String lable;
    FoodType(int value,String lable){
        this.value=value;
        this.lable=lable;
    }

    FoodType() {
    }

    public int getValue() {
        return value;
    }

    public String getLable() {
        return lable;
    }
}
