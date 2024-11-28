package com.neoteric.restuarant;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Order {


    private LocalDate date;
    private List<Items> items;

    public Order(LocalDate date, List<Items> items) {
        this.date = date;
        this.items = items;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Items> getItems() {
        return items;
    }

}
