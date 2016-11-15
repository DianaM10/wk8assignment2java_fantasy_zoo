package com.example.user.fantasyzoo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * Created by user on 13/11/2016.
 */

public class Zoo {

    private double cashInBank;
    ArrayList<Enclosure> allEnclosures;
    //list of enclosures
//    WaterEnclosure waterEnclosure;
//    StandardEnclosure standardEnclosure;
//    DarkEnclosure darkEnclosure;
//    Customer customer;

    public Zoo() {
        cashInBank = 15000.00;
        allEnclosures = new ArrayList<Enclosure>();
    }

    public void setCashInBank(double totalIncome) {
        this.cashInBank = totalIncome;
    }

    public double getCashInBank() {
        return (cashInBank);
    }

    public double sellTicket(Customer customer) {
        Ticket ticket = new Ticket();
        customer.buyTicket(ticket);
        return this.cashInBank + ticket.getPrice();
    }

    public String entryToZoo(Customer customer) {
        if (customer.getTicket() == 1) {
            return "Welcome to the Zoo!";
        } else return "Buy a ticket first or I will feed you to the zombie!";
    }

    public void addEnlosuresToZoo(Enclosure enclosure) {
        this.allEnclosures.add(enclosure);
    }

    public String rampage() {
        Random rand = new Random();
        int listSize = allEnclosures.size();
        int index = rand.nextInt(listSize);
        Enclosure enclosure = allEnclosures.get(index);
        if (enclosure instanceof WaterEnclosure) {
            ((WaterEnclosure) enclosure).emptyCage();
            return "The water enclosure has been compromised, creatures have escaped! Please evacuated the zoo in an orderly fashion.";
        }
        if (enclosure instanceof DarkEnclosure) {
            ((DarkEnclosure) enclosure).emptyCage();
            return "The dark enclosure has been compromised, creatures have escaped! Please evacuated the zoo in an orderly fashion.";
        }
        if (enclosure instanceof StandardEnclosure) {
            ((StandardEnclosure) enclosure).emptyCage();
            return "The standard enclosure has been compromised, creatures have escaped! Please evacuated the zoo in an orderly fashion.";
        }
        return "All is well in the Zoo, have a nice day!";
    }

    public String sell(FantasyCreature fantasyCreature) {
        if (fantasyCreature instanceof Submergable) {
            for (Enclosure enclosure : allEnclosures) {
                if (enclosure instanceof WaterEnclosure) {
                    ((WaterEnclosure) enclosure).remove(fantasyCreature);
                    return "Here is " + fantasyCreature.getName() + ". You owe me " + fantasyCreature.getPrice();
                }
            }
        }
        if (fantasyCreature instanceof Undeadable) {
            for (Enclosure enclosure : allEnclosures) {
                if (enclosure instanceof DarkEnclosure) {
                    ((DarkEnclosure) enclosure).remove(fantasyCreature);
                    return "Here is " + fantasyCreature.getName() + ". You owe me " + fantasyCreature.getPrice();
                }
            }
        }
        if (fantasyCreature instanceof Bleedable) {
            for (Enclosure enclosure : allEnclosures) {
                if (enclosure instanceof StandardEnclosure) {
                    ((StandardEnclosure) enclosure).remove(fantasyCreature);
                    return "Here is " + fantasyCreature.getName() + ". You owe me " + fantasyCreature.getPrice();
                }
            }

        }
        return "We don't have any left, go away";
    }

}