package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 14/11/2016.
 */

public class ZooTest {

    Zoo zoo;
    StandardEnclosure standardEnclosure1;
    DarkEnclosure darkEnclosure1;
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
        standardEnclosure1 = new StandardEnclosure(2);
        darkEnclosure1 = new DarkEnclosure(4);
        waterEnclosure = new WaterEnclosure(2);
        vampire1 = new Vampire("Spike", 136, 4, 478.99);
        vampire2 = new Vampire("Angel", 279, 4, 1289.53);
        vampire3 = new Vampire("Drusilla", 156, 4, 980.70);
        zombie1 = new Zombie("Ed", 29, 4, 58.98);
        dayWalker = new DayWalker("Blade", 78, 4, 1699.50);
        werewolf = new Werewolf("Scott McCall", 17, 3, 325.09);
        kelpie = new Kelpie("Duke", 379, 5, 987.60);
        lochNessMonster = new LochNessMonster("Nessie", 101, 5, 2500.50);
        standardEnclosure1.cage(dayWalker);
        standardEnclosure1.cage(werewolf);
        customer1 = new Customer(100.00, 0);
        customer2 = new Customer(30.53, 1);

    }

    @Test
    public void canCheckCashInBank() {
        assertEquals(15000.00, zoo.getCashInBank());
    }

    @Test
    public void zooCanSellTicket() {
        assertEquals(15015.50, zoo.sellTicket(customer1));
    }
}
