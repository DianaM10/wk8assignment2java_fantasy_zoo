package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 14/11/2016.
 */

public class ZooTest {

    Zoo zoo;
    StandardEnclosure standardEnclosure;
    DarkEnclosure darkEnclosure;
    WaterEnclosure waterEnclosure;
    Vampire vampire1;
    Vampire vampire2;
    Vampire vampire3;
    Zombie zombie1;
    DayWalker dayWalker;
    Werewolf werewolf;
    Kelpie kelpie;
    LochNessMonster lochNessMonster;
    Customer customer1;
    Customer customer2;
    Ticket ticket;

    @Before
    public void before() {
        zoo = new Zoo();
        standardEnclosure = new StandardEnclosure(2);
        darkEnclosure = new DarkEnclosure(4);
        waterEnclosure = new WaterEnclosure(2);
        vampire1 = new Vampire("Spike", 136, 4, 478.99);
        vampire2 = new Vampire("Angel", 279, 4, 1289.53);
        vampire3 = new Vampire("Drusilla", 156, 4, 980.70);
        zombie1 = new Zombie("Ed", 29, 4, 58.98);
        dayWalker = new DayWalker("Blade", 78, 4, 1699.50);
        werewolf = new Werewolf("Scott McCall", 17, 3, 325.09);
        kelpie = new Kelpie("Duke", 379, 5, 987.60);
        lochNessMonster = new LochNessMonster("Nessie", 101, 5, 2500.50);
        standardEnclosure.cage(dayWalker);
        standardEnclosure.cage(werewolf);
        customer1 = new Customer(100.00, 0);
        customer2 = new Customer(30.53, 1);
        darkEnclosure.cage(vampire1);
        darkEnclosure.cage(vampire2);
        darkEnclosure.cage(vampire3);
        darkEnclosure.cage(zombie1);
        standardEnclosure.cage(dayWalker);
        standardEnclosure.cage(werewolf);
        waterEnclosure.cage(kelpie);
        waterEnclosure.cage(lochNessMonster);
        zoo.addEnlosuresToZoo(darkEnclosure);
        zoo.addEnlosuresToZoo(waterEnclosure);
        zoo.addEnlosuresToZoo(standardEnclosure);


    }

    @Test
    public void canCheckCashInBank() {
        assertEquals(15000.00, zoo.getCashInBank());
    }

    @Test
    public void zooCanSellTicket() {
        assertEquals(15015.50, zoo.sellTicket(customer1));
    }

    @Test
    public void canPutUndeadablesinCage() {
        assertEquals(4,darkEnclosure.cageCount());
    }

    @Test
    public void customersCanEnterZoo() {
        assertEquals("Buy a ticket first or I will feed you to the zombie!", zoo.entryToZoo(customer1));
        assertEquals("Welcome to the Zoo!", zoo.entryToZoo(customer2));
    }

//    @Test
//    public void creaturesRandomlyRampage() {
//        assertEquals("Evacute Zoo please in an orderly fashion", zoo.rampage());
//    }

    @Test
    public void canSellCreature() {
        assertEquals("Here is Blade. You owe me 1699.5", zoo.sell(dayWalker));
        assertEquals(16699.50, zoo.getCashInBank());
        assertEquals(1, standardEnclosure.cageCount());

    }


}
