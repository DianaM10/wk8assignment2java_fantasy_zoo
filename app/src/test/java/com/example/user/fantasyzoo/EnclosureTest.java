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
    Vampire vampire1;
    Vampire vampire2;
    Vampire vampire3;
    DayWalker dayWalker;
    Werewolf werewolf;

    @Before
    public void before() {
        enclosure1 = new Enclosure(3);
        vampire1 = new Vampire("Spike", 136, 4, 478.99);
        vampire2 = new Vampire("Angel", 279, 4, 1289.53);
        vampire3 = new Vampire("Drusilla", 156, 4, 980.70);
        dayWalker = new DayWalker("Blade", 78, 4, 1699.50);
        werewolf = new Werewolf("Scott McCall", 17, 3, 325.09);

    }

    @Test
    public void canPutCreaturesInCages() {
        assertEquals(false, enclosure1.cageFull());
        enclosure1.cage(vampire1);
        enclosure1.cage(dayWalker);
        enclosure1.cage(vampire3);
        assertEquals(true, enclosure1.cageFull());
        assertEquals(3, enclosure1.cageCount());
    }

    @Test
    public void canRemoveCreatureFromCage() {
        enclosure1.cage(vampire1);
        enclosure1.cage(dayWalker);
        enclosure1.cage(vampire3);
        Cageable creature = enclosure1.remove();
        assertNotNull(creature);
    }

    @Test //only works if daywalker in added first, so removes first item, how to check what item then remove?
    public void canGetDayWalkerBackFromCage() {
        enclosure1.cage(dayWalker);
        enclosure1.cage(vampire1);
        enclosure1.cage(vampire3);
        Cageable creature = enclosure1.remove();
        DayWalker original = (DayWalker) creature;
        assertEquals("Blade", dayWalker.getName());
    }




}
