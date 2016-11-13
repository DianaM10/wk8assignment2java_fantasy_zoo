package com.example.user.fantasyzoo;

/**
 * Created by user on 13/11/2016.
 */

public class Customer {

    private double wallet;
    private int ticket;

    public Customer(double wallet, int ticket) {
        this.wallet = wallet;
        this.ticket = ticket;
    }

    public double getWallet() {
        return(wallet);
    }

    public int getTicket() {
        return(ticket);
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

}
