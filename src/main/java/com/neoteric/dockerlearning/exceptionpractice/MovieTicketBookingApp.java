package com.neoteric.dockerlearning.exceptionpractice;

public class MovieTicketBookingApp {

    public static void main(String[] args) {
        MovieTicketBooking bookingSystem = new MovieTicketBooking(100);
        double ticketPrice = 500;

        try {
            bookingSystem.bookTickets(ticketPrice);
            System.out.println("Booking Status: " + bookingSystem.getTicketStatus());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (BookingFailedException e) {
            System.out.println(e.getMessage());
            // Refund money if booking fails
            bookingSystem.refundMoney(ticketPrice);
            System.out.println("Booking Status: " + bookingSystem.getTicketStatus());
        }
    }
}
