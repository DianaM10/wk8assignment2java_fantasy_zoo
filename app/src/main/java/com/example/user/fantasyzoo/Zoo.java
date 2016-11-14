package com.example.user.fantasyzoo;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 13/11/2016.
 */

public class Zoo {

    private double cashInBank;
    ArrayList<Cageable> allEnclosures
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

    public String rampage() {
        this.allEnclosures.add(waterEnclosure);
        this.allEnclosures.add(darkEnclosure);
        this.allEnclosures.add(standardEnclosure);
        Random rand = new Random();
        int listSize = allEnclosures.size();
        int index = rand.nextInt(listSize);

        //empty cage at this index, and list what is in there in a string saying they are rampaging
        String answer = getAnswerAtIndex(index);
        return answer;
    }


}
