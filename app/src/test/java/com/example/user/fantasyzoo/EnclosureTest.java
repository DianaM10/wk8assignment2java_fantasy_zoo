package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 13/11/2016.
 */

public class EnclosureTest {

    Enclosure enclosure1;
    Enclosure enclosure2;
    Vampire vampire1;
    Vampire vampire2;
    Vampire vampire3;
    DayWalker dayWalker;
    Werewolf werewolf;

    @Before
    public void before() {
        enclosure1 = new Enclosure(3);
        enclosure2 = new Enclosure(2);
        vampire1 = new Vampire("Spike", 136, 4, 478.99);
        vampire2 = new Vampire("Angel", 279, 4, 1289.53);
        vampire3 = new Vampire("Drusilla", 156, 4, 980.70);
        dayWalker = new DayWalker("Blade", 78, 4, 1699.50);
        werewolf = new Werewolf("Scott McCall", 17, 3, 325.09);
        enclosure1.cage(dayWalker);
        enclosure1.cage(vampire1);
        enclosure1.cage(vampire3);
        enclosure2.cage(vampire2);

    }

    @Test
    public void cageHasSize() {
        assertEquals(3, enclosure1.getSize());
    }

    @Test
    public void canCheckCageIsFull() {
        assertEquals(true, enclosure1.cageFull());
    }

    @Test
    public void cageStartsEmpty() {
        enclosure1.emptyCage();
        assertEquals(0, enclosure1.cageCount());
    }

    @Test
    public void canEmptyCage() {
        enclosure1.emptyCage();
        assertEquals(0, enclosure1.cageCount());

    }

    @Test
    public void canRemoveCreatureFromCage() {
        Cageable creature = enclosure1.remove();
        assertNotNull(creature);
    }

    @Test //only works if daywalker in added first, so removes first item, how to check what item then remove?
    public void canGetDayWalkerBackFromCage() {
        Cageable creature = enclosure1.remove();
        DayWalker original = (DayWalker) creature;
        assertEquals("Blade", dayWalker.getName());
    }

    @Test
    public void canGetVampire1BackFromCage() {
        enclosure1.remove(vampire1);
        assertEquals(2, enclosure1.cageCount());
        assertEquals("Spike", vampire1.getName());

    }

    @Test
    public void canGetDayAnyCreatureBackFromCage() {
        enclosure1.remove(dayWalker);
        assertEquals(2, enclosure1.cageCount());
        assertEquals("Blade", dayWalker.getName());

    }

    @Test
    public void returnsNullwhenCreatureisNotinCage() {
        assertEquals(null,enclosure1.remove(werewolf));

    }

    @Test
    public void canCheckCreaturesinCage() {
        assertEquals(vampire2, enclosure2.checkCreature(vampire2));
    }





}
