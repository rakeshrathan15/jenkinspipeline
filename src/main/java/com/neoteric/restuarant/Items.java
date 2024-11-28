package com.neoteric.restuarant;

public class Items {

    private String itemName;
    private double price;
    private int itemId;

    public Items(String itemName, double price, int itemId) {
        this.itemName = itemName;
        this.price = price;
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getItemId() {
        return itemId;
    }
}
