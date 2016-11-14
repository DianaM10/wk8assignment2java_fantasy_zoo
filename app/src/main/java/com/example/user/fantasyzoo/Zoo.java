package com.example.user.fantasyzoo;

/**
 * Created by user on 13/11/2016.
 */

public class Zoo {

    private double cashInBank;
    //list of enclosures
    WaterEnclosure waterEnclosure;
    StandardEnclosure standardEnclosure;
    DarkEnclosure darkEnclosure;
    Customer customer;

    public Zoo(){
        cashInBank = 15000.00;
    }

    public void setCashInBank(double totalIncome) {
        this.cashInBank = totalIncome;
    }

    public double getCashInBank() {
        return(cashInBank);
    }

    public double sellTicket(Customer customer) {
        Ticket ticket = new Ticket();
        customer.buyTicket(ticket);
        return this.cashInBank + ticket.getPrice();
    }

    public String entryToZoo(Customer customer) {
        if (customer.getTicket() == 1) {
            return "Welcome to the Zoo!";
        }
        else return "Buy a ticket first or I will feed you to the zombie!";
    }


}
