package com.neoteric.restuarant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RestaurantTest2 {
    public static void main(String[] args) {

        List<Items> itemsList= new ArrayList<>();
        // Define items
        Items chickenBiryani = new Items("Chicken Biryani",200.0,3);
        Items muttonBiryani = new Items("Mutton Biryani",300.0,2);
        Items vegBiryani = new Items("Veg Biryani",100.0,3);

        itemsList.add(chickenBiryani);
        itemsList.add(muttonBiryani);
        itemsList.add(vegBiryani);

        // Define orders with dates
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(LocalDate.of(2024, 11, 25), Arrays.asList(chickenBiryani, muttonBiryani, vegBiryani)));
        orders.add(new Order(LocalDate.of(2024, 11, 25), Arrays.asList(chickenBiryani, vegBiryani)));
        orders.add(new Order(LocalDate.of(2024, 11, 26), Arrays.asList(chickenBiryani)));
        orders.add(new Order(LocalDate.of(2024, 11, 26), Arrays.asList(muttonBiryani)));
        orders.add(new Order(LocalDate.of(2024, 11, 27), Arrays.asList(vegBiryani, chickenBiryani)));

        // Create restaurant
        Restaurant restaurant = new Restaurant("Simple Restaurant",itemsList,orders);

        // Analyze orders per day
        Map<LocalDate, Long> ordersPerDay = restaurant.getOrders().stream()
                .collect(Collectors.groupingBy(Order::getDate, Collectors.counting()));

        // Find the day with the most orders
        long maxOrders = ordersPerDay.values().stream().max(Long::compareTo).orElse(0L);

        List<LocalDate> busiestDays = ordersPerDay.entrySet().stream()
                .filter(entry -> entry.getValue() == maxOrders)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Display results
        System.out.println("Orders per day:");
        ordersPerDay.forEach((date, count) -> System.out.println(date + ": " + count + " orders"));

        System.out.println("\nDay(s) with the most orders: " + busiestDays);
    }
}
