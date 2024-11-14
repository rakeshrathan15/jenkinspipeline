package com.neoteric.dockerlearning.exceptionpractice;

public class MovieTicketBooking {

    private double balance;
    private EnumTicketStatus ticketStatus;

    public MovieTicketBooking(double balance) {
        this.balance = balance;
        this.ticketStatus = EnumTicketStatus.FAILED;
    }


    public void bookTickets(double ticketPrice) throws InsufficientBalanceException, BookingFailedException {
        if (ticketPrice > balance) {
            throw new InsufficientBalanceException("Insufficient balance to book tickets.");
        }


        balance -= ticketPrice;
        System.out.println("Money debited: " + ticketPrice);


        if (Math.random() < 0.5) {
            throw new BookingFailedException("Ticket booking failed due to system error.");
        }


        ticketStatus = EnumTicketStatus.BOOKED;
        System.out.println("Ticket booked successfully!");
    }

    public void refundMoney(double amount) {
        balance += amount;
        ticketStatus = EnumTicketStatus.REFUNDED;
        System.out.println("Money refunded: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public EnumTicketStatus getTicketStatus() {
        return ticketStatus;
    }
}

