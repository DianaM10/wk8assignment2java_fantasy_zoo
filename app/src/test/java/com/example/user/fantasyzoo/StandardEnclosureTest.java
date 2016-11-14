package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 14/11/2016.
 */

public class StandardEnclosureTest {

    StandardEnclosure standardEnclosure1;
    StandardEnclosure standardEnclosure2;
    Zombie zombie1;
    DayWalker dayWalker;
    Werewolf werewolf;

    @Before
    public void before() {
        standardEnclosure1 = new StandardEnclosure(2);
        standardEnclosure2 = new StandardEnclosure(1);
        zombie1 = new Zombie("Ed", 29, 4, 58.98);
        dayWalker = new DayWalker("Blade", 78, 4, 1699.50);
        werewolf = new Werewolf("Scott McCall", 17, 3, 325.09);
        standardEnclosure1.cage(dayWalker);
        standardEnclosure1.cage(werewolf);

    }

    @Test
    public void cageHasSize() {
        assertEquals(2, standardEnclosure1.getSize());
    }

    @Test
    public void canCheckCageIsFull() {
        assertEquals(true, standardEnclosure1.cageFull());
    }

    @Test
    public void cageStartsEmpty() {
        standardEnclosure2.emptyCage();
        assertEquals(0, standardEnclosure2.cageCount());
    }

    @Test
    public void canEmptyCage() {
        standardEnclosure1.emptyCage();
        assertEquals(0, standardEnclosure1.cageCount());

    }

    @Test
    public void canRemoveCreatureFromCage() {
        Bleedable creature = standardEnclosure1.remove();
        assertNotNull(creature);
    }

    @Test
    public void canGetVampire1BackFromCage() {
        standardEnclosure1.remove(dayWalker);
        assertEquals(1, standardEnclosure1.cageCount());
        assertEquals("Blade", dayWalker.getName());

    }

    @Test
    public void canGetDayAnyCreatureBackFromCage() {
        standardEnclosure1.remove(werewolf);
        assertEquals(1, standardEnclosure1.cageCount());
        assertEquals("Scott McCall", werewolf.getName());

    }

    @Test
    public void returnsNullwhenCreatureisNotinCage() {
        assertEquals(null,standardEnclosure1.remove(zombie1));

    }

    @Test
    public void canCheckCreaturesinCage() {
        assertEquals(dayWalker, standardEnclosure1.checkCreature(dayWalker));
    }

}
