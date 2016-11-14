package com.example.user.fantasyzoo;

/**
 * Created by user on 13/11/2016.
 */

public class Ticket {

    private double price;
    public Integer ticketTotal;


    public Ticket() {
        price = 15.50;
        ticketTotal = 100;
    }

    public double getPrice() {
        return(price);

    }
    public double setPrice(double price) {
        return this.price = price;
    }
    public Integer getTicketTotal() {
        return(ticketTotal);
    }

    public Integer setTicketTotal(Integer ticketTotal) {
        return this.ticketTotal = ticketTotal;
    }
}
