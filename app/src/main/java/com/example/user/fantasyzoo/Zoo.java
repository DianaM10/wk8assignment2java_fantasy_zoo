package com.example.user.fantasyzoo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * Created by user on 13/11/2016.
 */

public class Zoo {

    private double cashInBank;
    ArrayList<Cageable> allEnclosures;
    //list of enclosures
    WaterEnclosure waterEnclosure;
    StandardEnclosure standardEnclosure;
    DarkEnclosure darkEnclosure;
    Customer customer;

    public Zoo(){
        cashInBank = 15000.00;
        allEnclosures = new ArrayList<Cageable>();
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

    public String rampage(ArrayList<Cageable> allEnclosures) {
        Random rand = new Random();
        int listSize = allEnclosures.size();
        int index = rand.nextInt(listSize);
        Object cage = allEnclosures.get(index);
        if (cage.equals(waterEnclosure)) {
            waterEnclosure.emptyCage();
            return "The water enclosure has been compromised, creatures have escaped!";
        }
        if( cage.equals(darkEnclosure)) {
            darkEnclosure.emptyCage();
            return "The dark enclosure has been compromised, creatures have escaped!";
        }
        if(cage.equals(standardEnclosure)) {
            standardEnclosure.emptyCage();
            return "The standard enclosure has been compromised, creatures have escaped!";
        }
        return "All is well in the Zoo, have a nice day!";
    }




}
