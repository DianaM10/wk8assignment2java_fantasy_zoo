package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 14/11/2016.
 */

public class WaterEnclosureTest {

    WaterEnclosure waterEnclosure1;
    WaterEnclosure waterEnclosure2;
    Vampire vampire1;
    Vampire vampire2;
    Vampire vampire3;
    Zombie zombie1;
    DayWalker dayWalker;
    Werewolf werewolf;
    Kelpie kelpie;
    LochNessMonster lochNessMonster;

    @Before
    public void before() {
        waterEnclosure1 = new WaterEnclosure(2);
        waterEnclosure2 = new WaterEnclosure(3);
        vampire1 = new Vampire("Spike", 136, 4, 478.99);
        vampire2 = new Vampire("Angel", 279, 4, 1289.53);
        vampire3 = new Vampire("Drusilla", 156, 4, 980.70);
        zombie1 = new Zombie("Ed", 29, 4, 58.98);
        dayWalker = new DayWalker("Blade", 78, 4, 1699.50);
        werewolf = new Werewolf("Scott McCall", 17, 3, 325.09);
        kelpie = new Kelpie("Duke", 379, 5, 987.60);
        lochNessMonster = new LochNessMonster("Nessie", 101, 5, 2500.50);

        waterEnclosure1.cage(kelpie);
        waterEnclosure1.cage(lochNessMonster);


    }

    @Test
    public void cageHasSize() {
        assertEquals(2, waterEnclosure1.getSize());
    }

    @Test
    public void canCheckCageIsFull() {
        assertEquals(true, waterEnclosure1.cageFull());
    }

    @Test
    public void cageStartsEmpty() {
        waterEnclosure2.emptyCage();
        assertEquals(0, waterEnclosure2.cageCount());
    }

    @Test
    public void canEmptyCage() {
        waterEnclosure1.emptyCage();
        assertEquals(0, waterEnclosure1.cageCount());

    }

    @Test
    public void canRemoveCreatureFromCage() {
        Submergable creature = waterEnclosure1.remove();
        assertNotNull(creature);
    }

    @Test
    public void canGetKelpieBackFromCage() {
        waterEnclosure1.remove(kelpie);
        assertEquals(1, waterEnclosure1.cageCount());
        assertEquals("Duke", kelpie.getName());

    }

    @Test
    public void canGetDayAnyCreatureBackFromCage() {
        waterEnclosure1.remove(lochNessMonster);
        assertEquals(1, waterEnclosure1.cageCount());
        assertEquals("Nessie", lochNessMonster.getName());

    }

    @Test
    public void returnsNullwhenCreatureisNotinCage() {
        assertEquals(null,waterEnclosure1.remove(werewolf));

    }

    @Test
    public void canCheckCreaturesinCage() {
        assertEquals(lochNessMonster, waterEnclosure1.checkCreature(lochNessMonster));
    }





}

