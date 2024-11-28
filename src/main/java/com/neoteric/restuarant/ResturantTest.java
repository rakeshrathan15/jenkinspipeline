package com.neoteric.restuarant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ResturantTest {


    public static void main(String[] args) {

        List<Items> itemsList = new ArrayList<>();
        Items chickenBiryani = new Items("Chicken Biryani", 200, 1);
        Items muttonBiryani = new Items("Mutton Biryani", 250, 2);
        Items vegBiryani = new Items("Veg Biryani", 150, 3);
        Items potBiryani = new Items("Pot Biryani", 300, 4);
        Items fryBiryani = new Items("Fry Biryani", 220, 5);

        itemsList.add(chickenBiryani);
        itemsList.add(muttonBiryani);
        itemsList.add(vegBiryani);
        itemsList.add(potBiryani);
        itemsList.add(fryBiryani);

        List<Order> orderList= new ArrayList<>();



        orderList.add(new Order(LocalDate.now(), Arrays.asList(chickenBiryani, muttonBiryani, vegBiryani)));
        orderList.add(new Order(LocalDate.now(), Arrays.asList(chickenBiryani, potBiryani, fryBiryani)));
        orderList.add(new Order(LocalDate.now(), Arrays.asList(vegBiryani, chickenBiryani, fryBiryani)));



       Restaurant restaurant= new Restaurant(" Neoteric Restaurant ",itemsList,orderList);


        Map<String, Long> salesCount = restaurant.getOrders().stream()
                .flatMap(order -> order.getItems().stream()) // Flatten items from all orders
                .collect(Collectors.groupingBy(Items::getItemName, Collectors.counting()));

       long maxCount= salesCount.values().stream().max(Long::compareTo).orElse(0L);
       long miniCount= salesCount.values().stream().min(Long::compareTo).orElse(0L);

        List<String> mostSoldItems =  salesCount.entrySet().stream().filter(entry -> entry.getValue()==maxCount).map(Map.Entry::getKey).collect(Collectors.toList());


        List<String> leastSoldItems = salesCount.entrySet().stream().filter(entry -> entry.getValue()==miniCount).map(Map.Entry::getKey).collect(Collectors.toList());


        System.out.println("Sales Summary:");
        salesCount.forEach((item, count) -> System.out.println(item + ": " + count + " orders"));

        System.out.println("\nMost Sold Item(s): " + mostSoldItems);
        System.out.println("Least Sold Item(s): " + leastSoldItems);




    }
}
