package com.neoteric.restuarant;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Restaurant {

    private String restaurantName;
    private List<Items> items;
    private List<Order> orders;

    public Restaurant(String restaurantName, List<Items> items, List<Order> orders) {
        this.restaurantName = restaurantName;
        this.items = items;
        this.orders = orders;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public List<Items> getItems() {
        return items;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
