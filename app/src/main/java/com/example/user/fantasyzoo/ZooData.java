package com.example.user.fantasyzoo;

/**
 * Created by user on 15/11/2016.
 */

public class ZooData {
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
    Food food;
    Ticket ticket;

    public ZooData() {
        zoo = new Zoo();
        standardEnclosure = new StandardEnclosure(2);
        darkEnclosure = new DarkEnclosure(4);
        waterEnclosure = new WaterEnclosure(2);
        vampire1 = new Vampire("Vampire", "Spike", 136, 4, 478.99);
        vampire2 = new Vampire("Vampire", "Angel", 279, 4, 1289.53);
        vampire3 = new Vampire("Vampire", "Drusilla", 156, 4, 980.70);
        zombie1 = new Zombie("Zombie", "Ed", 29, 4, 58.98);
        dayWalker = new DayWalker("Daywalker", "Blade", 78, 4, 1699.50);
        werewolf = new Werewolf("Werewolf", "Scott McCall", 17, 3, 325.09);
        kelpie = new Kelpie("Kelpie", "Duke", 379, 5, 987.60);
        lochNessMonster = new LochNessMonster("Loch Ness Monster", "Nessie", 101, 5, 2500.50);
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
        ticket = new Ticket();


    }
}
